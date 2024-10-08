package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AddProduct;


	@Repository
	public interface ProductReposistory extends MongoRepository<AddProduct, Long>{

		AddProduct findByid(long id);

		Optional<AddProduct> findByid(String productid);

		}

