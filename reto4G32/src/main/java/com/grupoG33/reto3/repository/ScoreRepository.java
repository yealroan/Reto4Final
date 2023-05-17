package com.grupoG33.reto3.repository;

import com.grupoG33.reto3.model.ScoreModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends JpaRepository<ScoreModel,Integer> {

}
