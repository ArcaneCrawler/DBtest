package com.example.demo.Repositories;

import com.example.demo.Entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<User, Long> {


}