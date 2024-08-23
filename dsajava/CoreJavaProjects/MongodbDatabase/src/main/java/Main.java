import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var client= MongoClients.create("mongodb://localhost:27017/");

        var database=client.getDatabase("expenseDB");
        System.out.println("Database is created"+database.getName());

        database.createCollection("expense");
        System.out.println("collection is created"+database.getName());
    }
}