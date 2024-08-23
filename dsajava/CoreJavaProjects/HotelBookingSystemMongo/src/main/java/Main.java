//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//CRUD operation in mongo db using java

//Add MongoDB driver in JAVA using Maven

//create client for mongodb connection
//create db from client
//create collection from db
//create document and add in db
//update document from collection
//delete document in collection
// access document from collection
//drop collection

import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import org.bson.Document;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

// Database Name : hotelDB, Collection Name:booking
// Document key name:bookingID,username ,userEmail, userMobile, checkInDate, checkOutDate
// noOfAdults, noOfChildren, noOfRoom, price, roomType, hotelName, meal, bookingStatus
// paymentStatus, paymentType, paymentId
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //to create the client for mongo db connection
        var client= MongoClients.create("mongodb://localhost:27017/");

        // to create or access the database from client
        var hotelDB=client.getDatabase("hotelDB");

        // to create the booking collection in hotelDB database
        //to check the collection exists or not
        var bookingCollection=hotelDB.getCollection("bookingCollection");
        if(bookingCollection.getNamespace().getCollectionName()=="bookingCollection")
        {
            System.out.println("Collection already exists");
        }
        else {
            hotelDB.createCollection("bookingCollection");
        }
        //to access the collection from database
        var random=new Random();

        //create document for hotel booking in collection
      /*  var bookingDocument=new Document();
        var random=new Random();

        //add data into document in key value pair
        bookingDocument.append("userName", "Shakib Khan");
        bookingDocument.append("userEmail","khanshakb4142@gmail.com");
        bookingDocument.append("userMobile","8299744037");
        bookingDocument.append("hotelName","Renaissance");
        bookingDocument.append("checkInDate","28 August 2024");
        bookingDocument.append("checkOutDate","29 August 2024");
        bookingDocument.append("meal",false);
        bookingDocument.append("roomType","Deluxe");
        bookingDocument.append("noOfAdults",2);
        bookingDocument.append("noOfChildren",0);
        bookingDocument.append("gst",18);
        bookingDocument.append("price",3300);
        bookingDocument.append("bookingStatus",true);
        bookingDocument.append("paymentType","cash");
        bookingDocument.append("paymentID",random.nextInt(9999));
        bookingDocument.append("paymentStatus",false);
        bookingDocument.append("bookingID",random.nextInt(999999));
        bookingDocument.append("discount",20);
        bookingCollection.insertOne(bookingDocument);*/

        // to insert the booking for multiple users at the same time
     /*   ArrayList<Document> bookingList=new ArrayList<>();
        //create document for hotel booking in collection
        var bookingDocument=new Document();


        //add data into document in key value pair
        bookingDocument.append("userName", "Shakib Khan");
        bookingDocument.append("userEmail","khanshakb4142@gmail.com");
        bookingDocument.append("userMobile","8299744037");
        bookingDocument.append("hotelName","Renaissance");
        bookingDocument.append("checkInDate","28 August 2024");
        bookingDocument.append("checkOutDate","29 August 2024");
        bookingDocument.append("meal",false);
        bookingDocument.append("roomType","Deluxe");
        bookingDocument.append("noOfAdults",2);
        bookingDocument.append("noOfChildren",0);
        bookingDocument.append("gst",18);
        bookingDocument.append("price",3300);
        bookingDocument.append("bookingStatus",true);
        bookingDocument.append("paymentType","cash");
        bookingDocument.append("paymentID",random.nextInt(9999));
        bookingDocument.append("paymentStatus",false);
        bookingDocument.append("bookingID",random.nextInt(999999));
        bookingDocument.append("discount",20);
        bookingList.add(bookingDocument);

        var bookingDocument1=new Document();


        //add data into document in key value pair
        bookingDocument1.append("userName", "Hamza");
        bookingDocument1.append("userEmail","hamza8880@gmail.com");
        bookingDocument1.append("userMobile","8299744037");
        bookingDocument1.append("hotelName","Renaissance");
        bookingDocument1.append("checkInDate","28 August 2024");
        bookingDocument1.append("checkOutDate","29 August 2024");
        bookingDocument1.append("meal",false);
        bookingDocument1.append("roomType","Deluxe");
        bookingDocument1.append("noOfAdults",2);
        bookingDocument1.append("noOfChildren",0);
        bookingDocument1.append("gst",18);
        bookingDocument1.append("price",3300);
        bookingDocument1.append("bookingStatus",true);
        bookingDocument1.append("paymentType","cash");
        bookingDocument1.append("paymentID",random.nextInt(9999));
        bookingDocument1.append("paymentStatus",false);
        bookingDocument1.append("bookingID",random.nextInt(999999));
        bookingDocument1.append("discount",20);
        bookingList.add(bookingDocument1);


        var bookingDocument2=new Document();


        //add data into document in key value pair
        bookingDocument2.append("userName", "sabi");
        bookingDocument2.append("userEmail","siddiquisabi12@gmail.com");
        bookingDocument2.append("userMobile","8299744037");
        bookingDocument2.append("hotelName","Renaissance");
        bookingDocument2.append("checkInDate","28 August 2024");
        bookingDocument2.append("checkOutDate","29 August 2024");
        bookingDocument2.append("meal",false);
        bookingDocument2.append("roomType","Deluxe");
        bookingDocument2.append("noOfAdults",2);
        bookingDocument2.append("noOfChildren",0);
        bookingDocument2.append("gst",18);
        bookingDocument2.append("price",3300);
        bookingDocument2.append("bookingStatus",true);
        bookingDocument2.append("paymentType","cash");
        bookingDocument2.append("paymentID",random.nextInt(9999));
        bookingDocument2.append("paymentStatus",false);
        bookingDocument2.append("bookingID",random.nextInt(999999));
        bookingDocument2.append("discount",20);
        bookingList.add(bookingDocument2);

        var bookingDocument3=new Document();


        //add data into document in key value pair
        bookingDocument3.append("userName", "Anas");
        bookingDocument3.append("userEmail","anas2@gmail.com");
        bookingDocument3.append("userMobile","8299744037");
        bookingDocument3.append("hotelName","Renaissance");
        bookingDocument3.append("checkInDate","28 August 2024");
        bookingDocument3.append("checkOutDate","29 August 2024");
        bookingDocument3.append("meal",false);
        bookingDocument3.append("roomType","Deluxe");
        bookingDocument3.append("noOfAdults",2);
        bookingDocument3.append("noOfChildren",0);
        bookingDocument3.append("gst",18);
        bookingDocument3.append("price",3300);
        bookingDocument3.append("bookingStatus",true);
        bookingDocument3.append("paymentType","cash");
        bookingDocument3.append("paymentID",random.nextInt(9999));
        bookingDocument3.append("paymentStatus",false);
        bookingDocument3.append("bookingID",random.nextInt(999999));
        bookingDocument3.append("discount",20);
        bookingList.add(bookingDocument3);

        bookingCollection.insertMany(bookingList);*/
/*
        //update the document by collection
        var updateBooking=new Document();
        updateBooking.append("meal",false);
        updateBooking.append("price",4000);
        updateBooking.append("noOfAdults",3);
        bookingCollection.updateOne(new Document("userName","sabi"),new Document("$set",updateBooking));

        // update many document from collection
        var updateDocument=new Document();
        updateDocument.append("meal",true);
        updateDocument.append("noOfAdults",3);
        updateDocument.append("paymentStatus",true);
        bookingCollection.updateMany(new Document("userName","Shakib Khan"),new Document("$set",updateDocument));*/

        //delete one document from collection
       // bookingCollection.deleteOne(new Document("userName","Anas"));
       // bookingCollection.deleteMany(new Document("userName","Shakib Khan"));

      /*  FindIterable<Document> iterDoc= bookingCollection.find();
        Iterator it= iterDoc.iterator();
        while(it.hasNext()){
            System.out.println();
        }*/
        //Retrieving document with where
      /*  BasicDBObject whereQuery=new BasicDBObject();
        whereQuery.put("bookingID",919145);
        FindIterable<Document> cursor= bookingCollection.find(whereQuery);
        String username=(String) cursor.iterator().next().get("userName");
        System.out.println(username);*/

        FindIterable<Document> result= bookingCollection.find();
        for(Document document:result){
            System.out.println(document);
        }
        //System.out.println(result.iterator().next());
    }
}