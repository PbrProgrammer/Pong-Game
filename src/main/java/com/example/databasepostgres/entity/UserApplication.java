package com.example.databasepostgres.entity;

import lombok.*;
import javax.persistence.*;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_application")
public class UserApplication {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String username;

    private String email;

    private String password;

    private String token;

    @OneToOne(mappedBy = "userApplicationApp")
    private Player player;

}

