package com.example.databasepostgres.service;

import com.example.databasepostgres.dto.PlayerDTO;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PlayerService {

     PlayerDTO addPlayer(PlayerDTO playerDTO) throws Exception;

     List<PlayerDTO> getPlayer();

     PlayerDTO editPlayer(@RequestBody PlayerDTO playerDTO) throws Exception;

     Boolean deletePlayer(@RequestBody PlayerDTO playerDTO) throws Exception;
}
