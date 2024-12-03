package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.respositories.CategoryRepository;

// registrando no spring as dependencias 
@Service
public class CategoryService {
	
	// criando dependencia:  userServices vai ter uma dependencia para o  UserRepository
	
	
	@Autowired // faz ainjeção de depeendecia de forma transparante ao programador
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
		
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}

}
