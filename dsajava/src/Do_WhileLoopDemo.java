public class Do_WhileLoopDemo {
    public static void main(String[] args) {
        int i=1, sum=0;
        do{
            System.out.print(i+" ");
            sum+=i;
            i++;

        }
        while(i<=10);
        System.out.println("");
        System.out.println("The sum of the numbers from 1 to 10 is : "+sum);
        String output=(sum%2==0)?"Sum is even":"Sum is odd";
        System.out.println(output);
        
    }
}
