/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.examenes.autenticacion.service;

import com.examenes.autenticacion.model.Rol;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author rafhael
 */

public interface RolService {
    public Rol findById(Long id);
    public Rol findByCodRol(String codigo);
    public Rol add(Rol rol);
    public Rol update(Rol rol);
    public Boolean delete(Long id);
    public List<Rol> getAll();
}
