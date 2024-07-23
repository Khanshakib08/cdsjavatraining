
import java.util.Scanner;

public class ForPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows/colums:");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
    }
}
