public class While_LoopDemo {
    public static void main(String[] args) {
        int i=1,sum=0;
        while(i<=10)
        {
            sum+=i;
            System.out.print(i+" ");
            i++;
        }
        System.out.println("");
        System.out.println("The sum of the numbers from 1 to 10 is : "+sum);
    }
    
}
