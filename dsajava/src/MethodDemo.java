
import java.util.Scanner;


public class MethodDemo{
    public static void main(String[] args) {
        System.out.println("Enter the height and width of the rectangle:");
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int w=sc.nextInt();
       int area= shape(l,w);  
       System.out.println("The area of rectangle is : "+area);
    }
    
private static int shape(int l, int w){
return (l*w);
}
}
