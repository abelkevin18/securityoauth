package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Estudiante;

public interface IEstudianteDAO extends JpaRepository<Estudiante, Integer>{

}
