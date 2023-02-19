package com.example.databasepostgres.repository;

import com.example.databasepostgres.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface PlayerRepository extends JpaRepository<Player, Long> {

    boolean existsByName(@Param("name") String name);

}
