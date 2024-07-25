
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1)Convert INR to USD\n2)Convert USD to INR");
        System.out.print("Enter your choice: ");
        int choice=sc.nextInt();
        
        switch(choice){
            case 1:
                convertINRtoUSD();
                break;
            case 2:
                convertUSDtoINR();
            default:
             System.out.println("Enter the input correctly");
        }
    }
    private static void  convertINRtoUSD(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value in INR: ");
        double valueINR=sc.nextDouble();
        double valueUSD=valueINR/83.77;
        System.out.println("The USD value of the giver INR value is : "+valueUSD);
    }
    private static void convertUSDtoINR(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value in USD: ");
        double valueUSD=sc.nextDouble();
        double valueINR=valueUSD*83.77;
        System.out.println("The INR value of the given USD value is : "+valueINR);
    }

}
