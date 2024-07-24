public class AverageOfSumArray {
    public static void main(String[] args) {
        int[] nos={1,7,3,11,24,9};
        double sum=0;
        for(int i=0;i<nos.length;i++)
        {
            sum+=nos[i];
        }
            double avg=sum/nos.length;
            System.out.println("The average of sum array is : "+avg);
    }
    
}
