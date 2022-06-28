package com.example.demo.Repository;

import com.example.demo.Model.UserBlog;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public class UserRepoBlog {
    @Transactional
    @Query(nativeQuery = true, value = "select * from userdata where user_id = ?1")
    UserBlog findOneById(int id) {
        return null;
    }
}
