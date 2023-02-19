package com.example.databasepostgres.mapper;

import com.example.databasepostgres.dto.ResultPlayDTO;
import com.example.databasepostgres.entity.ResultPlay;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ResultMapper {

    ResultPlay toResultPlayEntity(ResultPlayDTO resultPlayDTO);

    @Mapping(target = "player", ignore = true)
    @Mapping(target = "competition",ignore = true)
    ResultPlayDTO toResultPlayDTO(ResultPlay resultPlay);

    List<ResultPlayDTO> toResultPlayDTOList (List<ResultPlay> resultPlays);
}
