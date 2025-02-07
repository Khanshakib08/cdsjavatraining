import java.util.*;
class If_condition{
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("He/She is an Adult");
        } 
        else
        System.out.println("He/She is not an adult");
    }
}