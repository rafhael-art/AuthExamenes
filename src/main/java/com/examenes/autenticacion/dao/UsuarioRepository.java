/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.examenes.autenticacion.dao;

import com.examenes.autenticacion.model.Rol;
import com.examenes.autenticacion.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author rafhael
 */
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    Usuario FindByNombre(String nombre);
}
