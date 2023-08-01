package com.example.shoppingmall.data.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@Table(name = "user")
@ToString(exclude = "password")
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

    @Column(nullable = false, name="user_name")
    private String name;

    @Column(nullable = false, name="user_password")
    private String password;

    @Column(nullable = false, unique = true)
    private String email;
    
    private String address;
    

}
