package com.example.databasepostgres.repository;

import com.example.databasepostgres.entity.Competition;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetitionRepository extends PagingAndSortingRepository<Competition, Long> {


    boolean existsById(@Param("id") Long id);


}
