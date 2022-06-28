package com.example.demo.Repository;

import com.example.demo.Model.Blog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public class BlogRepository {
    @Transactional
    @Query(nativeQuery = true, value = "select * from blog where userId = ?1")
    Blog findOnById(int userId) {
        return null;
    }

}
