package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEstudianteDAO;
import com.example.demo.model.Estudiante;
import com.example.demo.service.IEstudianteService;

@Service
public class EstudianteServiceImpl implements IEstudianteService{
	
	@Autowired
	IEstudianteDAO estudianteDao;

	@Override
	public List<Estudiante> findAll() {
		// TODO Auto-generated method stub
		return estudianteDao.findAll();
	}
	
}
