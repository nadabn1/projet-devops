package com.formulaire.apk_formulaire.Service.Impl;
import com.formulaire.apk_formulaire.Dto.request.RegisterRequest;
import com.formulaire.apk_formulaire.Dto.response.UserResponse;
import com.formulaire.apk_formulaire.Exception.ResourceNotFoundException;
import com.formulaire.apk_formulaire.Exception.UserAlreadyExistsException;
import com.formulaire.apk_formulaire.Mapper.UserMapper;
import com.formulaire.apk_formulaire.Model.user;
import com.formulaire.apk_formulaire.Repository.UserRepository;
import com.formulaire.apk_formulaire.Service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserResponse registerUser(RegisterRequest request) {

        if (userRepository.existsByEmail(request.getEmail())) {
            throw new UserAlreadyExistsException("Email already exists");
        }

        user newUser = UserMapper.toEntity(request);

        user savedUser = userRepository.save(newUser);

        return UserMapper.toResponse(savedUser);
    }

    @Override
    public List<UserResponse> getAllUsers() {

        return userRepository.findAll()
                .stream()
                .map(UserMapper::toResponse)
                .collect(Collectors.toList());
    }

    @Override
    public UserResponse getUserById(Long id) {

        user foundUser = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));

        return UserMapper.toResponse(foundUser);
    }

    @Override
    public void deleteUser(Long id) {

        userRepository.deleteById(id);
    }
}