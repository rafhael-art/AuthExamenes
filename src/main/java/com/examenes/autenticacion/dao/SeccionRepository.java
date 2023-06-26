/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.examenes.autenticacion.dao;

import com.examenes.autenticacion.model.Seccion;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author rafhael
 */
public interface SeccionRepository extends JpaRepository<Seccion,Long> {
    Seccion FindByCodSeccion(String seccion);
}
