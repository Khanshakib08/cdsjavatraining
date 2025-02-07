import java.util.Scanner;
class ScannerDemo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("My age is:"+age);
        String adult = (age>=18)?"Eligible for voting":"Not aligible for voting";
       System.out.println(adult);
    }
} 