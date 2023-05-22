package com.grupoG33.reto3.repository;

import com.grupoG33.reto3.model.ReservationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<ReservationModel,Integer> {

    //@Query(value = "SELECT * FROM reto5g32.reservation where start_date BETWEEN ? and  ?", nativeQuery = true)
    List<ReservationModel> findByStartDateBetween(Date fechaInicio, Date fechaFin);

    Integer countByStatus(String status);

}
