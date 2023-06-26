/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examenes.autenticacion.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import java.util.Set;
import lombok.Data;

/**
 *
 * @author rafhael
 */
@Entity
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    private String nombre;
    private String apellidos;
    private String tipoDoc;
    private String numDoc;
    private int edad;
    private String codUbicacion;
    private String codSede;    
    @ManyToMany
    @JoinTable(name = "User_Roles",
            joinColumns = @JoinColumn(name ="userid" ,referencedColumnName = "idUsuario" ),
            inverseJoinColumns = @JoinColumn(name = "roleid",referencedColumnName = "idRol"))
    private Set<Rol> roles;
    
    @ManyToMany
    @JoinTable(name = "User_Seccions",
            joinColumns = @JoinColumn(name ="userid" ,referencedColumnName = "idUsuario" ),
            inverseJoinColumns = @JoinColumn(name = "seccionid",referencedColumnName = "idSeccion"))
    private Set<Seccion> secciones;
}

