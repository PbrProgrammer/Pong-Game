package com.example.databasepostgres.service.impl;

//import com.example.databasepostgres.configuration.MessageByLocaleComponent;
import com.example.databasepostgres.dto.CompetitionDTO;
import com.example.databasepostgres.entity.Competition;
import com.example.databasepostgres.exceptions.PongException;
import com.example.databasepostgres.mapper.CompetitionMapper;
import com.example.databasepostgres.repository.CompetitionRepository;
import com.example.databasepostgres.repository.PlayerRepository;
import com.example.databasepostgres.repository.ResultPlayRepository;
import com.example.databasepostgres.service.CompetitionService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CompetitionServiceImpl implements CompetitionService {

    private final CompetitionRepository competitionRepository;
    private final PlayerRepository playerRepository;
    private final ResultPlayRepository resultPlayRepository;
    private final CompetitionMapper competitionMapper;
 //   private final MessageByLocaleComponent message;

    public CompetitionServiceImpl(CompetitionRepository competitionRepository, PlayerRepository playerRepository, ResultPlayRepository resultPlayRepository, CompetitionMapper competitionMapper){//,// MessageByLocaleComponent message) {
        this.competitionRepository = competitionRepository;
        this.playerRepository = playerRepository;
        this.resultPlayRepository = resultPlayRepository;
        this.competitionMapper = competitionMapper;
        //this.message = message;
    }

    @Transactional
    public CompetitionDTO addCompetition(CompetitionDTO competitionDTO) {
        if (competitionDTO.getPlayers().size() == 2) {
          //  return competitionMapper.toCompetitionDto
                  //  (competitionRepository.save(competitionMapper.toCompetitionEntity(competitionDTO)));
        } else {
         //  throw new PongException.ValidationFailure(message.getMessage("two.player.valid"));
        }
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public List<CompetitionDTO> getAllCompetition( int offset, int limit) {
        Pageable pageable = PageRequest.of(offset, limit);
        return competitionRepository.findAll(pageable).stream()
                .map(competitionMapper::toCompetitionDto)
                .toList();
//        return competitionMapper.toCompetitionDtoList(competitionRepository.findAll(pageable).stream().toList());
    }

    @Override
    @Transactional
    public CompetitionDTO editCompetitionS(CompetitionDTO competitionDTO) {
        Optional<Competition> competition = competitionRepository.findById(competitionDTO.getComId());
        if (competition.isPresent()) {
            competition.get().setDayOfPlay(competitionDTO.getDayOfPlay());
           // competition.get().setResultPlay(competitionDTO.getResultPlay());
            competitionRepository.save(competition.get());
        } else {
          //  throw new PongException.BadRequest(message.getMessage("competition.not.found"));
        }
        return competitionMapper.toCompetitionDto(competition.get());
    }

    @Transactional
    public Boolean deleteCompetition(CompetitionDTO competitionDTO) {
        if (competitionRepository.existsById(competitionDTO.getComId())) {
            competitionRepository.deleteById(competitionDTO.getComId());
            return true;
        } else {
        //    throw new PongException.BadRequest(message.getMessage("competition.not.found"));
        }
        return null;
    }

}

