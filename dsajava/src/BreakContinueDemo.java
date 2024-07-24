class BreakContinueDemo{
    public static void main(String[] args) {
        System.out.println("output using break statement:");
        for(int i=1;i<=10;i++)
        {
            
            System.out.print(i+" ");
            if(i==7)
            break;
            
        }
        System.out.println("\noutput using continue statement:");
        for(int i=1;i<=10;i++)
        {
            
            if(i%2!=0)
            continue;
            
            System.out.println(i);
        }
    }
}