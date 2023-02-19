package com.example.databasepostgres.controller;

import com.example.databasepostgres.dto.ResultPlayDTO;
import com.example.databasepostgres.service.ResultPlayService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResultPlayController {

    private final ResultPlayService resultPlayService;

    public ResultPlayController(ResultPlayService resultPlayService) {
        this.resultPlayService = resultPlayService;
    }

    @PostMapping("/add-result")
    public ResultPlayDTO addResultPlay(@RequestBody ResultPlayDTO resultPlayDTO){
       return resultPlayService.addResultPlay(resultPlayDTO);
    }

    @GetMapping("/get-result")
    public List<ResultPlayDTO> getResultPlayByIdCom(@RequestParam Long competitionId) {
        return resultPlayService.getResultPlayByIdCom(competitionId);
    }

    @GetMapping("/get-all-result")
    public List<ResultPlayDTO> getAllResultPlay() {
        return resultPlayService.getAllResultPlay();
    }


    @PostMapping("/edit-result")
    public ResultPlayDTO editResultPlay(@RequestBody ResultPlayDTO resultPlayDTO) throws Exception {
        return resultPlayService.editResultPlay(resultPlayDTO);
    }

    @PostMapping("/delete-result")
    public Boolean deleteResultPlay(@RequestBody ResultPlayDTO resultPlayDTO) throws Exception {
        return resultPlayService.deleteResultPlay(resultPlayDTO);
    }
}
