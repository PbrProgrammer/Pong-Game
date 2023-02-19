package com.example.databasepostgres.dto;

import com.example.databasepostgres.enums.ResultsEnum;
import lombok.Data;

@Data
public class ResultPlayDTO {

    private Long resultId;

    private Integer point;

    private ResultsEnum resultsEnum;

    private CompetitionDTO competition;

    private PlayerDTO player;
}
