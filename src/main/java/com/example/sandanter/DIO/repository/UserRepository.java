package com.example.sandanter.DIO.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Usuario;

@Repository
public interface UserRepository extends JpaRepository<Usuario,Long>{
	boolean existsByAccountNumber(String accountNumber);
}
