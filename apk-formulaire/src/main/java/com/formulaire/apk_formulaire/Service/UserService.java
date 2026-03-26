package com.formulaire.apk_formulaire.Service;

import com.formulaire.apk_formulaire.Dto.request.RegisterRequest;
import com.formulaire.apk_formulaire.Dto.response.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse registerUser(RegisterRequest request);

    List<UserResponse> getAllUsers();

    UserResponse getUserById(Long id);

    void deleteUser(Long id);

}