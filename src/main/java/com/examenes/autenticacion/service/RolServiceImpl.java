/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examenes.autenticacion.service;

import com.examenes.autenticacion.dao.RolRepository;
import com.examenes.autenticacion.model.Rol;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rafhael
 */
@Service
public class RolServiceImpl implements RolService{

    @Autowired
    private RolRepository rolRepository;

    @Override
    public Rol findById(Long id) {
       return rolRepository.findById(id).get();
    }

    @Override
    public Rol findByCodRol(String codigo) {
        return rolRepository.findByCodRol(codigo);
    }

    @Override
    public Rol add(Rol rol) {
        rolRepository.save(rol);
        return rol;
    }

    @Override
    public Rol update(Rol rol) {
        rolRepository.save(rol);
        return rol;
    }

    @Override
    public Boolean delete(Long id) {
        Rol model = rolRepository.findById(id).get();
        rolRepository.delete(model);
        return true;
    }

    @Override
    public List<Rol> getAll() {
        return rolRepository.findAll();
    }
    
    
}
