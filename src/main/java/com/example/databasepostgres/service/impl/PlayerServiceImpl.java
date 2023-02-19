package com.example.databasepostgres.service.impl;

import com.example.databasepostgres.dto.PlayerDTO;
import com.example.databasepostgres.mapper.PlayerMapper;
import com.example.databasepostgres.repository.PlayerRepository;
import com.example.databasepostgres.service.PlayerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    private final PlayerMapper playerMapper;
    private final PlayerRepository playerRepository;

    public PlayerServiceImpl(PlayerMapper playerMapper, PlayerRepository playerRepository) {
        this.playerMapper = playerMapper;
        this.playerRepository = playerRepository;
    }


    @Override
    public PlayerDTO addPlayer(PlayerDTO playerDTO) throws Exception {
        if(!playerRepository.existsByName(playerDTO.getName())){
            return playerMapper.toPlayerDTO(playerRepository.save(playerMapper.toPlayerEntity(playerDTO)));
        }else {
            throw new Exception("Player Exists");
        }
    }

    @Override
    public List<PlayerDTO> getPlayer() {
        return playerMapper.toPlayerDTOList(playerRepository.findAll());
    }

    @Override
    public PlayerDTO editPlayer(PlayerDTO playerDTO) throws Exception {
        return null;
    }

    @Override
    public Boolean deletePlayer(PlayerDTO playerDTO) throws Exception {
        return null;
    }
}
