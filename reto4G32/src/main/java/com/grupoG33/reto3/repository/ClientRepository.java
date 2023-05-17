package com.grupoG33.reto3.repository;

import com.grupoG33.reto3.model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientModel,Integer> {

}
