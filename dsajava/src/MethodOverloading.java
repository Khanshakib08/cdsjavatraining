
import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Enter today's earning and expenses:");
        Scanner sc= new Scanner(System.in);
        int earning=sc.nextInt();
        int expense=sc.nextInt();
       int saving= todaysSavings(earning,expense);
       System.out.println("Saving is : "+saving);

       System.out.println("Enter the amount received via UPI :");
       double earningUPI=sc.nextDouble();
        double expenseUPI=sc.nextDouble();
       double savingUPI= todaysSavings(earningUPI,expenseUPI);
       System.out.println("Saving is : "+savingUPI);
}
private static int todaysSavings(int earning, int expense){
return (earning-expense);
}
private static double todaysSavings(double earningUPI, double expenseUPI){
    return (earningUPI-expenseUPI);
}
}
