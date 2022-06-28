package com.example.demo.Service;

import com.example.demo.Model.UserResponse;

import java.util.concurrent.CompletableFuture;

public interface UserServiceInterface {
    CompletableFuture<UserResponse> getData(int id);
}
