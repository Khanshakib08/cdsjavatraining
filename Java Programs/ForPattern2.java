import java.util.Scanner;

public class ForPattern2 {
    public static void main(String[] args) {
  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows/colums:");
        int n=sc.nextInt();
        for (int i = 1; i < n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("Another Pattern:");
        for (int i = 0; i < n; i++)
        {
            for(int j=1; j<n; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

