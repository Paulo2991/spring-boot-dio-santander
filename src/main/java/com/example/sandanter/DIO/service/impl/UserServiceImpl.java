package com.example.sandanter.DIO.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.example.sandanter.DIO.model.Usuario;
import com.example.sandanter.DIO.repository.UserRepository;
import com.example.sandanter.DIO.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
	@Override
	public Usuario findById(Long id) {
		return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public Usuario create(Usuario usuario) {
		if (userRepository.existsByAccountNumber(usuario.getAccount().getNumber())) {
			throw new IllegalArgumentException("This Account number already exists.");
		}
		return userRepository.save(usuario);
	}
}
