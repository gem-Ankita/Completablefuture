package com.example.demo.Repository;

import com.example.demo.Model.UserBlog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface UserRepositoryImplement extends JpaRepository<UserBlog, String> {
    @Transactional
    @Query(nativeQuery = true, value = "select * from userdata where user_id = ?1")
    UserBlog findOneById(int id);
}
