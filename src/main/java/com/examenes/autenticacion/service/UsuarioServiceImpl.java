/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examenes.autenticacion.service;

import com.examenes.autenticacion.dao.RolRepository;
import com.examenes.autenticacion.dao.UsuarioRepository;
import com.examenes.autenticacion.model.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rafhael
 */
@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Override
    public Usuario FindById(Long id) {
        return  usuarioRepository.findById(id).get();
    }

    @Override
    public Usuario FindByNombre(String nombre) {
        return usuarioRepository.findByNombre(nombre);
    }

    @Override
    public Usuario add(Usuario usuario) {
        usuarioRepository.save(usuario);
        return usuario;
    }

    @Override
    public Usuario edit(Usuario usuari) {
       usuarioRepository.save(usuari);
        return usuari;
    }

    @Override
    public boolean delete(Long ind) {
        var model =  FindById(ind);
        usuarioRepository.delete(model);
        return true;
    }

    @Override
    public List<Usuario> getAll() {
       return usuarioRepository.findAll();
    }
    
}
