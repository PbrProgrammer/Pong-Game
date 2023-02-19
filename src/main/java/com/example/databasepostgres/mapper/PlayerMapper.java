package com.example.databasepostgres.mapper;

import com.example.databasepostgres.dto.PlayerDTO;
import com.example.databasepostgres.entity.Player;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PlayerMapper {

    Player toPlayerEntity(PlayerDTO playerDTO);

    @Mapping(target = "competitionList",ignore = true)
    PlayerDTO toPlayerDTO(Player player);

    List<PlayerDTO> toPlayerDTOList(List<Player> players);
}
