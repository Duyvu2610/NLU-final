package matcha.project.profileservice.client;

import feign.QueryMap;
import matcha.project.profileservice.dto.TokenExchangeParam;
import matcha.project.profileservice.dto.TokenExchangeResponse;
import matcha.project.profileservice.dto.UserCreationParam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "identity-client", url = "${identity.url}")
public interface IdentityClient {
    @PostMapping(value = "/realms/matcha/protocol/openid-connect/token", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    TokenExchangeResponse exchangeToken(@QueryMap TokenExchangeParam tokenExchangeParam);

    @PostMapping(value = "/admin/realms/matcha/users", consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Object> createUser(@RequestHeader("authorization") String token, @RequestBody UserCreationParam userCreationParam);
}
