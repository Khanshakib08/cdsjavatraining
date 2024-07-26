
import java.util.Scanner;

public class BMIcalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("CALCULATION OF BMI INDEX\n");
        System.out.print("Enter your weight(in kg) : ");
        int weight=sc.nextInt();
        System.out.print("Enter your height(in cm) : ");
        int height=sc.nextInt();
        float bmi=((float)weight/((float
        )Math.pow(height,2)))*10000;
        System.out.println("Your BMI is : "+bmi+"kg/m²");
        if(bmi<18.5)
        {
            System.out.println("You are underweight.");
        }
        else if(bmi<25)
        {
            System.out.println("You are normal.");
        }
        else if(bmi<30)
        {
            System.out.println("You are overweight.");
        }
        else
        {
            System.out.println("You are obese.");
        }
    }

}
