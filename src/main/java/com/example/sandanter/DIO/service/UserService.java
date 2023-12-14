package com.example.sandanter.DIO.service;

import model.Usuario;

public interface UserService {
	public Usuario findById(Long id);
	
	public Usuario create(Usuario usuario);
}
