/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examenes.autenticacion.service;

import com.examenes.autenticacion.dao.SeccionRepository;
import com.examenes.autenticacion.model.Seccion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rafhael
 */
@Service
public class SeccionServiceImpl implements SeccionService{
    @Autowired
    private SeccionRepository secccionRepository;

    @Override
    public Seccion add(Seccion seccion) {
        secccionRepository.save(seccion);
        return seccion;
    }

    @Override
    public Seccion edit(Seccion seccion) {
        secccionRepository.save(seccion);
        return seccion;
    }

    @Override
    public Seccion FindByCodSeccion(String seccion) {
       return secccionRepository.findByCodSeccion(seccion);       
    }

    @Override
    public Seccion FindById(Long id) {
        return secccionRepository.findById(id).get();
    }

    @Override
    public boolean delete(Long id) {
        var model = secccionRepository.findById(id).get();
        secccionRepository.delete(model);
        return  true;
    }

    @Override
    public List<Seccion> getAll() {
        return secccionRepository.findAll();
    }
    
}
