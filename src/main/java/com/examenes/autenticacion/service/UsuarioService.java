/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.examenes.autenticacion.service;

import com.examenes.autenticacion.model.Usuario;
import java.util.List;

/**
 *
 * @author rafhael
 */
public interface UsuarioService {
    Usuario FindById(Long id);
    Usuario FindByNombre(String nombre);
    Usuario add(Usuario usuario);
    Usuario edit(Usuario usuari);
    boolean delete(Long ind);
    List<Usuario> getAll();
}
