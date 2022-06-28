package com.example.demo.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@Entity
@Table
@Getter
@Setter
public class Blog {
    @Id
    int userId;
    String blogId;
    String blogName;

}
