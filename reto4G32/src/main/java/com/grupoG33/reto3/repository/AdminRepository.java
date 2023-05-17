package com.grupoG33.reto3.repository;

import com.grupoG33.reto3.model.AdminModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdminModel,Integer> {

}
