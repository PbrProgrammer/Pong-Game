package com.example.databasepostgres.controller;

import com.example.databasepostgres.dto.CompetitionDTO;
import com.example.databasepostgres.dto.PlayerDTO;
import com.example.databasepostgres.service.PlayerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @PostMapping("/add-player")
    public PlayerDTO addPlayer(@RequestBody PlayerDTO playerDTO) throws Exception {
        return playerService.addPlayer(playerDTO);
    }

    @GetMapping("/get-all-player")
    public List<PlayerDTO> getPlayer() {
        return playerService.getPlayer();
    }


    @PostMapping("/edit-player")
    public PlayerDTO editPlayer(@RequestBody PlayerDTO playerDTO) throws Exception {
        return playerService.editPlayer(playerDTO);
    }

    @PostMapping("/delete-player")
    public Boolean deletePlayer(@RequestBody PlayerDTO playerDTO) throws Exception {
        return playerService.deletePlayer(playerDTO);
    }
}
