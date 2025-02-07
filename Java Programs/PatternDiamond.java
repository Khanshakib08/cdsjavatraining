import java.util.Scanner;

public class PatternDiamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        for (int i = 0; i <n; i++)
        {
            for (int j=1; j<(2*n) ;j++)
            {   
                if(j==(n-i) || j==(n+i)) 
                {
                    System.out.print("*");
                } 
                else
                System.out.print(" ");    
            }
            System.out.println("");
        }
        for (int i = n-2; i >=0; i--)
        {
            for (int j=1; j<(2*n) ;j++)
            {   
                if(j==(n-i) || j==(n+i)) 
                {
                    System.out.print("*");
                } 
                else
                System.out.print(" ");    
            }
            System.out.println("");
        }
            
        }
    }
    
