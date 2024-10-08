package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ReviewModel;



@Repository
public interface ReviewReposistory extends MongoRepository<ReviewModel, Long>{

}
