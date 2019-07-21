package com.example.demo;

import java.util.List;

import com.example.demo.Entities.LinkList;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;


public class MongoDBPOperations {

    public void saveList(MongoOperations mongoOperation, LinkList linkList) {

        mongoOperation.save(linkList);
        System.out.println("List saved successfully");
        // List object got created with id.
        System.out.println("List : " + linkList);
    }

    public void searchList(MongoOperations mongoOperation, String critera, String value) {
        // query to search
        Query searchList = new Query(Criteria.where(critera).is(value));

        // find List based on the query
        LinkList resultList = mongoOperation.findOne(searchList, LinkList.class);
        System.out.println("List found!!");
        System.out.println("List details: " + resultList);
    }

    public void updateList(MongoOperations mongoOperation, String critera, String value, String updateCriteria, String updateValue) {
        // query to search List
        Query searchList = new Query(Criteria.where(critera).is(value));
        mongoOperation.updateFirst(searchList, Update.update(updateCriteria, updateValue),
                LinkList.class);
        System.out.println("List got updated successfully");
    }

    public void getAllList(MongoOperations mongoOperation) {
        List listLists = mongoOperation.findAll(LinkList.class);
        for (Object linkList : listLists) {
            System.out.println("List = " + linkList);
        }
    }


}