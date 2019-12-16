package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Estudiante;
import com.example.demo.service.IEstudianteService;

@RestController
@RequestMapping(value = "api")
public class EstudianteController {
	
	@Autowired
	IEstudianteService estudianteService;
	
	@GetMapping("/estudiantes")
	public List<Estudiante> getEstudiantes() {
		return estudianteService.findAll();
	}
	
	@GetMapping("/estudiantes2")
	public List<Estudiante> getEstudiantes2() {
		return estudianteService.findAll();
	}
}
