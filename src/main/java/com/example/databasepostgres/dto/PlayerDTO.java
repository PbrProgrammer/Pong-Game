package com.example.databasepostgres.dto;

import com.example.databasepostgres.entity.Competition;
import com.example.databasepostgres.entity.ResultPlay;
import com.example.databasepostgres.entity.UserApplication;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
public class PlayerDTO {

    private Long playerId;

    private UserApplication userApplicationApp;

    private String name;

    private String groupOfPlay;

    private Set<Competition> competitionList;

    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private Date createdBy;
}
