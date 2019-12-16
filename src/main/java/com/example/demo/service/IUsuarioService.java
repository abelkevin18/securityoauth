package com.example.demo.service;

import com.example.demo.model.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
