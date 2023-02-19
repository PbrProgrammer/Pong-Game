package com.example.databasepostgres.entity;

import lombok.*;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id", nullable = false)
    private Long playerId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private UserApplication userApplicationApp;

    @Column(name = "name")
    private String name;

    @Column(name = "group_play")
    private String groupOfPlay;

    @ManyToMany
    @JoinTable(
            name = "player_competition",
            joinColumns = @JoinColumn(name = "player_id"),
            inverseJoinColumns = @JoinColumn(name = "com_id"))
    Set<Competition> competitionList;

    @OneToMany(mappedBy = "player", fetch = FetchType.LAZY)
    private Set<ResultPlay> resultPlays;

    @Column(name = "created_by")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdBy;


}
