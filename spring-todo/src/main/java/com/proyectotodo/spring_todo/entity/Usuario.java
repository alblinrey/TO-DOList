package com.proyectotodo.spring_todo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity // Esto dice que será una tabla en la BBDD
@Getter
@Setter
public class Usuario {
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Genera ID automáticamente
    @Id //Indica que es PK.
    private Long id;
    private String nombre;
    private String correo;
    private String contraseña;

}
