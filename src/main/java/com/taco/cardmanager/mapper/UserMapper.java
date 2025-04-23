package com.taco.cardmanager.mapper;

import com.taco.cardmanager.model.dto.request.UserRequestDTO;
import com.taco.cardmanager.model.dto.response.UserResponseDTO;
import com.taco.cardmanager.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    // Конвертация User -> UserResponseDTO (для ответов)
    @Mapping(target = "bankCards", ignore = true)
    UserResponseDTO toResponseDTO(User user);

    // Конвертация UserRequestDTO -> User (для создания)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "bankCards", ignore = true)
    User fromRequestDTO(UserRequestDTO dto);

    // Обновление User из UserRequestDTO
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "bankCards", ignore = true)
    void updateFromRequestDTO(UserRequestDTO dto, @MappingTarget User user);
}

