/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examenes.autenticacion.controller;

import com.examenes.autenticacion.model.Rol;
import com.examenes.autenticacion.model.Usuario;
import com.examenes.autenticacion.service.RolService;
import com.examenes.autenticacion.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rafhael
 */
@RestController
@RequestMapping("/api/user")
public class UsuarioController {
    @Autowired
    private UsuarioService userService;
    
    @GetMapping("/findAll")
    public ResponseEntity<List<Usuario>> findAll(){
        return new ResponseEntity<>(userService.getAll(),HttpStatus.OK);
    }
    
    @GetMapping("/findByNombre/{name}")
    public ResponseEntity<Usuario> findByName(@PathVariable String name){
        return new ResponseEntity<>(userService.FindByNombre(name),HttpStatus.OK);
    }
    
    @GetMapping("/findById/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable Long id){
        return new ResponseEntity<>(userService.FindById(id),HttpStatus.OK);
    }
     
    @PostMapping("/add")
    public ResponseEntity<Usuario> add(@RequestBody Usuario user){
        return new ResponseEntity<>(userService.add(user),HttpStatus.CREATED);
    }
    
    @PostMapping("/update")
    public ResponseEntity<Usuario> edit(@RequestBody Usuario user){
        return new ResponseEntity<>(userService.edit(user),HttpStatus.OK);
    }
    
    @PostMapping("/delete")
    public ResponseEntity<Boolean> delete(@RequestParam Long id){
        return new ResponseEntity<>(userService.delete(id),HttpStatus.OK);
    }
}
