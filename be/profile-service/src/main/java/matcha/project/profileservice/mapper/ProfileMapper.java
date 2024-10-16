package matcha.project.profileservice.mapper;

import matcha.project.profileservice.dto.request.ProfileRequestDto;
import matcha.project.profileservice.dto.response.ProfileResponseDto;
import matcha.project.profileservice.entity.ProfileEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProfileMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "userId", ignore = true)
    ProfileEntity toEntity(ProfileRequestDto profileRequestDto);

    ProfileRequestDto toDto(ProfileEntity profileEntity);

    ProfileResponseDto toResponseDto(ProfileEntity profileEntity);
}
