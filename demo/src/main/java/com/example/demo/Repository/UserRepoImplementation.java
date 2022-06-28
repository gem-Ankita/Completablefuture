package com.example.demo.Repository;

import com.example.demo.Model.Blog;
import com.example.demo.Model.UserBlog;
import com.example.demo.Model.UserResponse;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.CompletableFuture;


public class UserRepoImplementation {
    @Autowired
    private UserRepoImplementation userRepoImplementation;
    @Autowired
    private UserRepoBlog userRepoBlog;

    public CompletableFuture<UserResponse> getData(int id) {
        try{
            UserBlog user = null;
            Blog blog = null;
            user = userRepoBlog.findOneById(id);
            UserResponse response = new UserResponse(user, blog);
            return CompletableFuture.completedFuture(response);
        }catch (Exception e){
            e.printStackTrace();
        }
        return CompletableFuture.completedFuture(null);
    }
}
