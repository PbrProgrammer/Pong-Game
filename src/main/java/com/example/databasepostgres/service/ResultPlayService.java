package com.example.databasepostgres.service;

import com.example.databasepostgres.dto.ResultPlayDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ResultPlayService {

     ResultPlayDTO addResultPlay(ResultPlayDTO resultPlayDTO);

     List<ResultPlayDTO> addResultsPlay(List<ResultPlayDTO> resultPlayDTO);

     List<ResultPlayDTO> getResultPlayByIdCom(Long competitionId);

     List<ResultPlayDTO> getAllResultPlay();

     ResultPlayDTO editResultPlay(ResultPlayDTO resultPlayDTO) throws Exception;

     Boolean deleteResultPlay(ResultPlayDTO resultPlayDTO) throws Exception;
}
