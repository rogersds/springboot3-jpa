package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.respositories.OrderRepository;

// registrando no spring as dependencias 
@Service
public class OrderService {

	// criando dependencia: userServices vai ter uma dependencia para o
	// UserRepository

	@Autowired // faz ainjeção de depeendecia de forma transparante ao programador
	private OrderRepository repository;

	public List<Order> findAll() {
		return repository.findAll();
	}

	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

}
