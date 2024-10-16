package matcha.project.profileservice.service;

import lombok.RequiredArgsConstructor;
import matcha.project.profileservice.client.IdentityClient;
import matcha.project.profileservice.dao.ProfileDao;
import matcha.project.profileservice.dto.Credential;
import matcha.project.profileservice.dto.TokenExchangeParam;
import matcha.project.profileservice.dto.TokenExchangeResponse;
import matcha.project.profileservice.dto.UserCreationParam;
import matcha.project.profileservice.dto.request.ProfileRequestDto;
import matcha.project.profileservice.entity.ProfileEntity;
import matcha.project.profileservice.mapper.ProfileMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfileService {
    private final ProfileDao profileDao;

    private final ProfileMapper profileMapper;

    private final IdentityClient identityClient;

    @Value("${identity.clientId}")
    private String clientId;

    @Value("${identity.clientSecret}")
    private String clientSecret;

    public ProfileEntity createProfile(ProfileRequestDto profileRequestDto) {
        // Create account in Keycloak

        // Exchange client token
        TokenExchangeResponse token = identityClient.exchangeToken(
                TokenExchangeParam.builder()
                        .grant_type("client_credentials")
                        .client_id(clientId)
                        .client_secret(clientSecret)
                        .scope("openid")
                        .build());

        // Create user in Keycloak with the token and given data
        ResponseEntity<Object> creationResponse = identityClient.createUser(
                String.format("Bearer %s", token.getAccessToken()),
                UserCreationParam.builder()
                        .username(profileRequestDto.getUsername())
                        .firstName(profileRequestDto.getFirstName())
                        .lastName(profileRequestDto.getLastName())
                        .email(profileRequestDto.getEmail())
                        .enabled(true)
                        .emailVerified(false)
                        .credentials(List.of(Credential.builder()
                                .type("password")
                                .temporary(false)
                                .value(profileRequestDto.getPassword())
                                .build()))
                        .build());
        System.out.println(creationResponse);
        // Get user id from Keycloak
        ProfileEntity profileEntity = profileMapper.toEntity(profileRequestDto);
        profileDao.save(profileEntity);
        return profileEntity;
    }

    public ProfileEntity getProfile(final String id) {
        return profileDao.findById(id).orElseThrow();
    }
}
