import com.mongodb.client.MongoClients;

public class MongodbGUI {
    public static void main(String[] args) {
        var client= MongoClients.create("mongodb://localhost:27017/");
    }
}
