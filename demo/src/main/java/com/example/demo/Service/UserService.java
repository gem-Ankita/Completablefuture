package com.example.demo.Service;

import com.example.demo.Model.UserResponse;
import com.example.demo.Repository.UserRepoBlog;
import com.example.demo.Repository.UserRepoImplementation;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;

import java.util.concurrent.CompletableFuture;

public class UserService implements UserServiceInterface{

    @Autowired
    private UserRepoImplementation userRepoImplementation;

    @Override
    @Async
    public CompletableFuture<UserResponse> getData(int id) {
        return userRepoImplementation.getData(id);
    }
}
