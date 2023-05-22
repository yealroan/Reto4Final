package com.grupoG33.reto3.controller;

import com.grupoG33.reto3.dbo.AdminDbo;
import com.grupoG33.reto3.model.AdminModel;
import com.grupoG33.reto3.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    @GetMapping("/all")
    public List<AdminModel> obtenerAdministradores(){
        return adminService.obtenerAdministradores();
    }

    //Todo: Solucionar error
    @PostMapping("/save")
    public String crearAdministradores(@RequestBody AdminDbo admin){
        //return adminService.crearAdministradores(admin);
        return null;
        }

    @DeleteMapping("{id}")
    public  void eliminar(@PathVariable int id){
       adminService.eliminar(id);
    }
}
