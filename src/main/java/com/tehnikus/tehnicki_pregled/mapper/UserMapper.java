package com.tehnikus.tehnicki_pregled.mapper;

import com.tehnikus.tehnicki_pregled.dto.UserDto;
import com.tehnikus.tehnicki_pregled.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    public UserDto modelToDto(User user);
    public User dtoToModel(UserDto dto);
}
