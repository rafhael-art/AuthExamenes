/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examenes.autenticacion.controller;

import com.examenes.autenticacion.model.Rol;
import com.examenes.autenticacion.model.Seccion;
import com.examenes.autenticacion.service.RolService;
import com.examenes.autenticacion.service.SeccionService;
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
@RequestMapping("/api/seccion")
public class SeccionController {
    @Autowired
    private SeccionService secService;
    
    @GetMapping("/findAll")
    public ResponseEntity<List<Seccion>> findAll(){
        return new ResponseEntity<>(secService.getAll(),HttpStatus.OK);
    }
    
    @GetMapping("/findByCodSeccion/{name}")
    public ResponseEntity<Seccion> findByName(@PathVariable String sec){
        return new ResponseEntity<>(secService.FindByCodSeccion(sec),HttpStatus.OK);
    }
    
    @GetMapping("/findById/{id}")
    public ResponseEntity<Seccion> findByName(@PathVariable Long id){
        return new ResponseEntity<>(secService.FindById(id),HttpStatus.OK);
    }
     
    @PostMapping("/add")
    public ResponseEntity<Seccion> add(@RequestBody Seccion sec){
        return new ResponseEntity<>(secService.add(sec),HttpStatus.CREATED);
    }
    
    @PostMapping("/edit")
    public ResponseEntity<Seccion> update(@RequestBody Seccion sec){
        return new ResponseEntity<>(secService.edit(sec),HttpStatus.OK);
    }
    
    @PostMapping("/delete")
    public ResponseEntity<Boolean> delete(@RequestParam Long id){
        return new ResponseEntity<>(secService.delete(id),HttpStatus.OK);
    }
}
