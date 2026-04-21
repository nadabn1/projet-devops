package com.formulaire.apk_formulaire.Dto.response;

import com.formulaire.apk_formulaire.Enums.Role;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserResponse {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private String country;

    private Role role;

    private LocalDateTime createdAt;

}