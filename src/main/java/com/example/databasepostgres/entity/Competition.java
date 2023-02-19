package com.example.databasepostgres.entity;

import lombok.*;
import javax.persistence.*;

import java.util.*;
//import javax.validation.constraints.Size;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Competition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "com_id", nullable = false)
    private Long comId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dayOfPlay;

   // @Size(max = 2)
    @ManyToMany(mappedBy = "competitionList", fetch = FetchType.LAZY)
    private Set<Player> players = new HashSet<>();

   // @Size(max = 2)
    @OneToMany(mappedBy = "competition", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Set<ResultPlay> resultPlay = new HashSet<>();


}
