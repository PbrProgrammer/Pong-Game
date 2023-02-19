package com.example.databasepostgres.service;

import com.example.databasepostgres.dto.CompetitionDTO;

import java.util.List;

public interface CompetitionService {
    CompetitionDTO addCompetition(CompetitionDTO competitionDTO) throws Exception;

    List<CompetitionDTO> getAllCompetition(int offset, int limit);

    CompetitionDTO editCompetitionS(CompetitionDTO competitionDTO) throws Exception;

    Boolean deleteCompetition(CompetitionDTO competitionDTO) throws Exception;
}
