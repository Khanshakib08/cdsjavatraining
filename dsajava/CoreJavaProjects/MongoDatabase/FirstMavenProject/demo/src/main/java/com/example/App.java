package com.example;

/**
 * Hello world!
 *
 */
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
public class App {
    // MongoDB is NoSQL means object based database, faster than SQL, easy to use.
    //1. Create the mongo db connection using client.
    //2. Create mongodb database.
    //3. Access the database.
    //4. Delete the database.
    //5. Create mongo db collection.
    //6. Access the collection.
    //7. Delete the collection.
    //8. Insert the document into colection. 
    //9. Access the document from the collection 
    //10. Update the document in collection.
    //11. Delete the document in collection.
public static void main(String[] args) {
    // Create mongo db client for establishing the collection.
    MongoClient client=MongoClients.create("mongodb://localhost:27017/");
}
}
