package com.example.alumno.entities;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

public class Alumno {
    @Column(name = "nombre")
    private String nombre;
    @Column (name = "apellido")
    private String apellido;
    @Column (name = "email")
    private String email;
    @Column (name= "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;
}

