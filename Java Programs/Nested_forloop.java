class Nested_forloop{
    public static void main(String[] args) {
        int i, j;
        int n=5;
        for (i = 1; i < 6; i++) 
        {
            for(j=1; j<=n; j++)
            {
                System.out.print(j);
               
            }
             n--;
             System.out.println();
        }
    }

}