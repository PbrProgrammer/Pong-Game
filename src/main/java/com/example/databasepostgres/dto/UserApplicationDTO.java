package com.example.databasepostgres.dto;

import com.example.databasepostgres.entity.Player;
import lombok.Data;

@Data
public class UserApplicationDTO {

    private Long userId;

    private String username;

    private String email;

    private String password;

    private String token;

    private Player player;
}
