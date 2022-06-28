package com.example.demo.Controller;

import com.example.demo.Model.UserResponse;
import com.example.demo.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@Slf4j
@RestController
@RequestMapping(value = "/blog")
public class blogController {
    @Autowired
    UserService userService;

    @PostMapping("/getData")
    public CompletableFuture<UserResponse> getData(
            @RequestParam(value = "id") int id) {
        return userService.getData(1);
    }
}
