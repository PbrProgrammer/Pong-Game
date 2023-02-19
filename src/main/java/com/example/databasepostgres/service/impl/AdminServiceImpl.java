package com.example.databasepostgres.service.impl;

import com.example.databasepostgres.entity.UserApplication;
import com.example.databasepostgres.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class AdminServiceImpl  {

    private final UserRepository userRepository;

    public AdminServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }



    public UserApplication login(UserApplication users) {

        if (userRepository.findByUsernameAndAndPassword(users.getUsername(), users.getPassword()) != null) {
            String token=givenTokenUserToNextLogin();
            userRepository.updateToken(users.getUsername(),token);
            users.setToken(token);
            return users;
        }
        return null;

    }
    public String givenTokenUserToNextLogin() {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 16;
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
