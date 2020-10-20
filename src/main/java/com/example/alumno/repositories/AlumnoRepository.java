package com.example.alumno.repositories;


import com.example.alumno.entities.Alumni;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends BaseRepository<Alumni, Long> {
}
