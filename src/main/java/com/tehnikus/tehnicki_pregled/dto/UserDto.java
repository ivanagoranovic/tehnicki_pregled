package com.tehnikus.tehnicki_pregled.dto;

public record UserDto(
        Long id,
        String username,
        String email,
        String password
) {

}
