
import java.util.Scanner;

public class SwitchWeekDays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day:\n a)Monday\n b)Tuesday\n c)Wednesday\n d)Thursday\n e)Friday\n f)Saturday\n g)Sunday");
        String day=sc.nextLine();
        switch(day)
        {
            case "Monday":
            System.out.println("I will go to college");
            break;
            case "Tuesday":
            System.out.println("I will go to gym");
            break;
            case "Wednesday":
            System.out.println("I will go to park");
            break;
            case "Thursday":
            System.out.println("I will go to travel");
            break;
            case "Friday":
            System.out.println("I will go for a movie");
            break;
            case "Saturday":
            System.out.println("I will go to market");
            break;
            case "Sunday":
            System.out.println("I will take rest");
            break;
            default:
            System.out.println("Enter the input correctly");
        }

    }
    
}
