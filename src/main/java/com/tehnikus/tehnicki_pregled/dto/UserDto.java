package com.tehnikus.tehnicki_pregled.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import lombok.Data;

@Data
public class UserDto {

    private Long id;

    private String username;

    private String email;
    private String password;
}
