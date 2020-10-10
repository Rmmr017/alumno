package com.example.alumno.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "alumno")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Alumno extends Base implements Serializable {

    @Column(name = "nombre")
    String nombre;
    @Column(name = "apellido")
    String apellido;
    @Column(name = "email")
    String email;
    @Column(name = "createAt")
    Date createAt;
}
