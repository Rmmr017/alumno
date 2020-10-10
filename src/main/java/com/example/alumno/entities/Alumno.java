package com.example.alumno.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "alumno")
public class Alumno implements Serializable {

    @Column(name = "nombre")
    String nombre;
    @Column(name = "apellido")
    String apellido;
    @Column(name = "email")
    String email;
    @Column(name = "createAt")
    Date createAt;
}
