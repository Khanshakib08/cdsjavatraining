
import java.util.Scanner;

public class BMIcalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("CALCULATION OF BMI INDEX\n");
        System.out.print("Enter your weight(in kg) : ");
        int weight=sc.nextInt();
        System.out.print("Enter your height(in cm) : ");
        int height=sc.nextInt();
        double bmi=((double)weight/((double)Math.pow(height,2)))*10000;
        System.out.println("Your BMI is : "+bmi);
    }

}
