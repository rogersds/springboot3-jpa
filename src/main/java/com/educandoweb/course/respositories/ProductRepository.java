package com.educandoweb.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
	 

}
