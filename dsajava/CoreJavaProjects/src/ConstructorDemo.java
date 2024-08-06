
import java.util.Scanner;

public class ConstructorDemo {
public static void main(String[] args) {
    System.out.println("Enter the values:");
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    System.out.println("Enter your choice:\n1->ADD\n2->SUB\n3->MUL");
    int z=sc.nextInt();

    Value value=new Value(x, y, z);
    int calculation=value.calc();
    System.out.println(calculation);
    
}
}
class Value{
    int num1,num2,choice,total;

        Value(int x, int y, int z) {
            num1=x;
            num2=y;
            choice=z;
        }
        int calc() {
            switch (choice) {
                case 1:
                    total=num1+num2;
                    break;
                    case 2:
                    total=num1-num2;
                    break;
                    case 3:
                    total=num1*num2;
                    break;
                default:
                    System.out.println("Enter choice between 1 to 3");;
            }
            return total;
        }
    
    }
