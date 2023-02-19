package com.example.databasepostgres.repository;

import com.example.databasepostgres.entity.UserApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends JpaRepository<UserApplication, Long> {

    UserApplication findByUsernameAndAndPassword(@Param("username") String username, @Param("password") String password);

    UserApplication findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByToken(String token);

    @Transactional
    @Modifying
    @Query("update UserApplication c set c.token =:token where c.username =:username")
    void updateToken(String username, String token);
}
