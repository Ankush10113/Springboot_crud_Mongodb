package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AddCart;



@Repository
public interface CartReposistory extends MongoRepository<AddCart, Long>{

}
