package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.respositories.UserRepository;

// registrando no spring as dependencias 
@Service
public class UserService {
	
	// criando dependencia:  userServices vai ter uma dependencia para o  UserRepository
	
	
	@Autowired // faz ainjeção de depeendecia de forma transparante ao programador
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}

}
