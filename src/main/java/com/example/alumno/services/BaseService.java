package com.example.alumno.services;

import com.example.alumno.entities.Base;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends Base, ID extends Serializable> {
    public List<E> findAll()throws Exception; //Traer una lista de 	todas las personas de nuestra base de datos
    public E findById(ID id) throws Exception; //Trae una 	persona de acuerdo a su numero de Id
    public E save(E entity) throws Exception; //Crea una nueva 	entidad
    public E update(ID id, E entity) throws Exception; //Actualiza a la entidad segun Id
    public boolean delete(ID id) throws Exception; //Elimina un 	registro de la base de datos
}