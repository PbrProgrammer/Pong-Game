package com.example.databasepostgres.repository;

import com.example.databasepostgres.entity.ResultPlay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ResultPlayRepository extends JpaRepository<ResultPlay, Long> {


    List<ResultPlay> findByCompetition_ComId(@RequestParam("comId") Long comId);
}
