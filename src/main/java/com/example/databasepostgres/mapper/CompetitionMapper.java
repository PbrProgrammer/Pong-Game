package com.example.databasepostgres.mapper;

import com.example.databasepostgres.dto.CompetitionDTO;
import com.example.databasepostgres.entity.Competition;
import org.mapstruct.*;

import java.util.List;

@Named("FatherMapper")
@Mapper(componentModel = "spring", uses = {PlayerMapper.class, ResultMapper.class})
public interface CompetitionMapper {

    //    Competition toCompetitionEntity(CompetitionDTO competitionDTO);
//
    @Mapping(target = "players", ignore = true)
    @Mapping(target = "resultPlay", ignore = true)
    CompetitionDTO toCompetitionDto(Competition competition);

    List<CompetitionDTO> toCompetitionDtoList(List<Competition> competition);


}
