package com.mongo.movies;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoIterable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class MongoMoviesApplicationTests {

    @Autowired
    MongoClient mongoClient;

    @Value("${spring.mongodb.database}")
    String databaseName;

    @Test
    void contextLoads() {
    }

    @Test
    public void testConnection() {

        boolean found = false;
        MongoIterable<String> databaseNames = mongoClient.listDatabaseNames();
        for (String dbname : databaseNames) {
            if (databaseName.equals(dbname)) {
                found = true;
                break;
            }
        }
        Assertions.assertTrue(found, "We can connect to MongoDB, but couldn't find expected database. Check the restore step");
    }

}
