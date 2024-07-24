
import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        String name="Shakib Khan";
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println("Enter Your Name:");
        Scanner sc=new Scanner(System.in);
        String sname=sc.nextLine();
        if(sname.equals("shakib khan"))
        {
            System.out.println("allowed");
        }
        else
        {
            System.out.println("not allowed");
        }
    }
    
}
