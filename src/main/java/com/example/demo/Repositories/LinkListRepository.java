package com.example.demo.Repositories;

import com.example.demo.Entities.LinkList;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LinkListRepository extends MongoRepository<LinkList, Long> {


}