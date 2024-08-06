
import java.util.HashMap;

public class HashMapExample {
public static void main(String[] args) {
    
    HashMap<String, Integer>myfriends=new HashMap<>();
    myfriends.put("Ashmita", 20);
    myfriends.put("Anjali", 20);
    myfriends.put("Hamza", 22);
    myfriends.put("Sabi", 23);
    System.out.println(myfriends);
  /*   myfriends.put("Ashmita", 21);
    for(String name:myfriends.keySet())
    {
        System.out.println(name);
    }
    for(int age:myfriends.values())
    {
        System.out.println(age);
    }
    System.out.println(myfriends.get("Ashmita"));
    myfriends.clear();
    System.out.println("After clear"+myfriends);
    Scanner sc=new Scanner(System.in);
    String name=sc.next();
    if(myfriends.containsKey(name))
    {
        System.out.println("Name already exists");
    }*/
    
    /*for(String name: myfriends.keySet())
    {
        if(myfriends.get(name)>20)
        {
            System.out.println(name);
        }
    }*/
}
}
