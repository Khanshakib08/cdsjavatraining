public class GreatestNumberInArray {
    public static void main(String[] args) {
        int[] nos={1,7,3,11,24,9};
        int l=nos[0];
        for(int i=1;i<nos.length;i++)
        {
            if(nos[i]>l)
            {
                l=nos[i];
            }
        }
        System.out.println("Largest element in the array is : "+l);
    }
    
}
