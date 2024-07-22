class Nested_while{
    public static void main (String[] args){
    int i=1, j;
        while(i<5)
    {
        j=3;
        while(j<6)
        {
            if((i+j)%2==0)
            {
                System.out.println("Sum of "+i+" & "+j+" is even");
            }
            else
            {
                System.out.println("Sum of "+i+" & "+j+" is odd");
            }
            j++;
        }
        i++;
    }
}
}