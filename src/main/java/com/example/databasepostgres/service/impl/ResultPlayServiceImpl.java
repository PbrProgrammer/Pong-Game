package com.example.databasepostgres.service.impl;

import com.example.databasepostgres.dto.ResultPlayDTO;
import com.example.databasepostgres.entity.Competition;
import com.example.databasepostgres.entity.ResultPlay;
import com.example.databasepostgres.enums.ResultsEnum;
import com.example.databasepostgres.mapper.ResultMapper;
import com.example.databasepostgres.repository.CompetitionRepository;
import com.example.databasepostgres.repository.PlayerRepository;
import com.example.databasepostgres.repository.ResultPlayRepository;
import com.example.databasepostgres.service.ResultPlayService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResultPlayServiceImpl implements ResultPlayService {

    private final ResultPlayRepository resultPlayRepository;
    private final CompetitionRepository competitionRepository;
    private final PlayerRepository playerRepository;
    private final ResultMapper resultMapper;

    public ResultPlayServiceImpl(ResultPlayRepository resultPlayRepository, CompetitionRepository competitionRepository, PlayerRepository playerRepository, ResultMapper resultMapper) {
        this.resultPlayRepository = resultPlayRepository;
        this.competitionRepository = competitionRepository;
        this.playerRepository = playerRepository;
        this.resultMapper = resultMapper;
    }

    @Override
    public ResultPlayDTO addResultPlay(ResultPlayDTO resultPlayDTO) {
        ResultPlay resultPlay =new ResultPlay();
        if(!resultPlayRepository.existsById(resultPlayDTO.getResultId())){
            Competition competition= competitionRepository.findById(resultPlayDTO.getCompetition().getComId()).get();
            resultPlay.setCompetition(competition);
            resultPlay.setPlayer(playerRepository.findById(resultPlayDTO.getPlayer().getPlayerId()).get());
            resultPlay.setPoint(resultPlayDTO.getPoint());
            if (resultPlayDTO.getPoint() == 11) {
                resultPlay.setResultsEnum(ResultsEnum.WINNER);
            } else {
                resultPlay.setResultsEnum(ResultsEnum.LOSER);
            }
        }
        resultPlayRepository.save(resultPlay);
        return resultMapper.toResultPlayDTO(resultPlay);
    }

    @Override
    public List<ResultPlayDTO> addResultsPlay(List<ResultPlayDTO> resultPlayDTOs) {
        List<ResultPlayDTO> rp=new ArrayList<>();
        resultPlayDTOs.forEach(resultPlayDTO -> {
            rp.add(addResultPlay(resultPlayDTO));
        });
        return rp;
    }


    @Override
    public List<ResultPlayDTO> getResultPlayByIdCom(Long competitionId) {
      return resultMapper.toResultPlayDTOList(resultPlayRepository.findByCompetition_ComId(competitionId));
    }

    @Override
    public List<ResultPlayDTO> getAllResultPlay() {
        return null;
    }

    @Override
    public ResultPlayDTO editResultPlay(ResultPlayDTO resultPlayDTO) throws Exception {
        return null;
    }

    @Override
    public Boolean deleteResultPlay(ResultPlayDTO resultPlayDTO) throws Exception {
        return null;
    }
}
