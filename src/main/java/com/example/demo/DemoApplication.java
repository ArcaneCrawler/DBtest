package com.example.demo;

import com.example.demo.Config.MongoConfig;
import com.example.demo.Entities.LinkList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.mongodb.core.MongoOperations;

@Lazy

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        // For Annotation
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MongoConfig.class);
        MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
        MongoDBPOperations ops = new MongoDBPOperations();

        String[][] link = new String[10][5];
        LinkList list = new LinkList(1, link, "http://spring-projects.ru/guides/accessing-data-mongodb/", "Db", "This is mongo", "Not allow", "kofsdfsdfisdfji");

        //save
        ops.saveList(mongoOperation, list);

        // get
        ops.searchList(mongoOperation, "name", "Db");

        //update based on criteria
        ops.updateList(mongoOperation, "name", "Db", "preview", "mongo");
        // get based on search criteria
        ops.searchList(mongoOperation, "name", "Db");

        // get all
        ops.getAllList(mongoOperation);


    }


}


