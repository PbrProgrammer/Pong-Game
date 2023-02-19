package com.example.databasepostgres.entity;

import com.example.databasepostgres.enums.ResultsEnum;
import lombok.*;
import javax.persistence.*;

import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ResultPlay {
    @Id
    @Column(name = "result_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resultId;

    private Integer point;

    @Enumerated(EnumType.STRING)
    private ResultsEnum resultsEnum;

    @ManyToOne()
    @JoinColumn(name = "com_id", referencedColumnName = "com_id")
    private Competition competition;

    @ManyToOne()
    @JoinColumn(name = "player_id", referencedColumnName = "player_id")
    private Player player;

}
