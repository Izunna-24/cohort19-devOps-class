package com.example.devops.demo.services.interfaces;

import com.example.devops.demo.dtos.requests.RegisterRequest;
import com.example.devops.demo.dtos.responses.RegisterUserResponse;

public interface UserInterface {
    RegisterUserResponse register(RegisterRequest request);
}
