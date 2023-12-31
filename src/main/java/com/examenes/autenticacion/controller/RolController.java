/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examenes.autenticacion.controller;

import com.examenes.autenticacion.model.Rol;
import com.examenes.autenticacion.service.RolService;
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
@RequestMapping("/api/role")
public class RolController {
    @Autowired
    private RolService rolService;
    
    @GetMapping("/findAll")
    public ResponseEntity<List<Rol>> findAll(){
        return new ResponseEntity<>(rolService.getAll(),HttpStatus.OK);
    }
    
    @GetMapping("/findByCodRol/{name}")
    public ResponseEntity<Rol> findByName(@PathVariable String name){
        return new ResponseEntity<>(rolService.findByCodRol(name),HttpStatus.OK);
    }
    
    @GetMapping("/findById/{id}")
    public ResponseEntity<Rol> findByName(@PathVariable Long id){
        return new ResponseEntity<>(rolService.findById(id),HttpStatus.OK);
    }
     
    @PostMapping("/add")
    public ResponseEntity<Rol> add(@RequestBody Rol rol){
        return new ResponseEntity<>(rolService.add(rol),HttpStatus.CREATED);
    }
    
    @PostMapping("/update")
    public ResponseEntity<Rol> update(@RequestBody Rol rol){
        return new ResponseEntity<>(rolService.update(rol),HttpStatus.OK);
    }
    
    @PostMapping("/delete")
    public ResponseEntity<Boolean> delete(@RequestParam Long id){
        return new ResponseEntity<>(rolService.delete(id),HttpStatus.OK);
    }
}
