class ForLoopDemo
{
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <=10; i++) 
        {
            sum +=i;
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("Sum of the numbers from 1 to 10:"+sum);
    }
}