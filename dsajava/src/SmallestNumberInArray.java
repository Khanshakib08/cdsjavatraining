public class SmallestNumberInArray {
    public static void main(String[] args) {
        int[] nos={1,7,3,11,24,9};
        int s=nos[0];
        for(int i=1;i<nos.length;i++)
        {
            if(nos[i]<s)
            {
                s=nos[i];
            }
        }
        System.out.println("Smallest element in the array is : "+s);
    }
}
