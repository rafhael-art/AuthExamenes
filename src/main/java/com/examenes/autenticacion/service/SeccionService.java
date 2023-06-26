/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.examenes.autenticacion.service;

import com.examenes.autenticacion.model.Seccion;
import java.util.List;

/**
 *
 * @author rafhael
 */
public interface SeccionService {
    public Seccion add(Seccion seccion);
    public Seccion edit(Seccion seccion);
    public Seccion FindByCodSeccion(String seccion);
    public Seccion FindById(Long id);
    public boolean delete(Long id);
    public List<Seccion> getAll();
}
