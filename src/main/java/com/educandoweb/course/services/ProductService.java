package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.respositories.ProductRepository;

// registrando no spring as dependencias 
@Service
public class ProductService {
	
	// criando dependencia:  userServices vai ter uma dependencia para o  UserRepository
	
	
	@Autowired // faz ainjeção de depeendecia de forma transparante ao programador
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
		
		
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}

}
