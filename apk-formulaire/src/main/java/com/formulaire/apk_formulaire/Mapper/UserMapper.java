package com.formulaire.apk_formulaire.Mapper;

import com.formulaire.apk_formulaire.Dto.request.RegisterRequest;
import com.formulaire.apk_formulaire.Dto.response.UserResponse;
import com.formulaire.apk_formulaire.Enums.Role;
import com.formulaire.apk_formulaire.Model.user;

import java.time.LocalDateTime;

public class UserMapper {

    public static user toEntity(RegisterRequest request) {

        return user.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .password(request.getPassword())
                .phone(request.getPhone())
                .country(request.getCountry())
                .role(Role.USER)
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static UserResponse toResponse(user user) {

        UserResponse response = new UserResponse();

        response.setId(user.getId());
        response.setFirstName(user.getFirstName());
        response.setLastName(user.getLastName());
        response.setEmail(user.getEmail());
        response.setPhone(user.getPhone());
        response.setCountry(user.getCountry());
        response.setRole(user.getRole());
        response.setCreatedAt(user.getCreatedAt());

        return response;
    }

}