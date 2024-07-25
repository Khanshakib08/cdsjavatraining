
import java.util.Random;

public class OTPGeneration {
    public static void main(String[] args) {
        Random random = new Random();
        int myOTP = random.nextInt(1000000);
        System.out.println("Your OTP is : "+myOTP);
    }

}
