package com.example.databasepostgres.controller;

import com.example.databasepostgres.dto.CompetitionDTO;
import com.example.databasepostgres.service.CompetitionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompetitionController {
    private final CompetitionService competitionService;

    public CompetitionController(CompetitionService competitionService) {
        this.competitionService = competitionService;
    }


    @PostMapping("/add-com")
    public CompetitionDTO addCompetition(@RequestBody CompetitionDTO competitionDTO) throws Exception {
       return competitionService.addCompetition(competitionDTO);
    }

    @GetMapping("/get-all-com")
    public List<CompetitionDTO> getAllCompetition(int offset, int limit){
        return competitionService.getAllCompetition(offset,limit);
    }

    @PostMapping("/edit-com")
    public CompetitionDTO editCompetition(@RequestBody CompetitionDTO competitionDTO) throws Exception {
        return competitionService.editCompetitionS(competitionDTO);
    }

    @PostMapping("/delete-com")
    public Boolean deleteCompetition(@RequestBody CompetitionDTO competitionDTO) throws Exception{
        return competitionService.deleteCompetition(competitionDTO);
    }
}
