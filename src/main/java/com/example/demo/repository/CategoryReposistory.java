package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AddCategory;



@Repository
public interface CategoryReposistory extends MongoRepository<AddCategory, Long>{


}