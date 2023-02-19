package com.example.databasepostgres.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
public class CompetitionDTO {

    private Long comId;

    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private Date dayOfPlay;

    @Size(min = 2, max = 2)
    @NotEmpty
    @NotNull
    private Set<PlayerDTO> players = new HashSet<>();

    @Size(min = 2, max = 2)
    private Set<ResultPlayDTO> resultPlay = new HashSet<>();
}
