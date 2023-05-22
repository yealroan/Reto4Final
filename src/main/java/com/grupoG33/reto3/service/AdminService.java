package com.grupoG33.reto3.service;

import com.grupoG33.reto3.model.AdminModel;
import com.grupoG33.reto3.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    AdminRepository adminRepository;

    public List<AdminModel> obtenerAdministradores(){
        return adminRepository.findAll();
    }

    public String crearAdministradores(AdminModel adminModel){
        adminRepository.save(adminModel);
        return "Se creo el usuario";
        }

    public void eliminar(int id){
        adminRepository.deleteById(id);
    }

}
