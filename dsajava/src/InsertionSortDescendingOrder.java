public class InsertionSortDescendingOrder {
    public static void main(String[] args) {
        int[] nos={1,7,3,11,24,9};
        int i,key;
        for(int j=1; j<nos.length; j++)
        {
            key=nos[j];
            i=j-1;
            while(i>=0 && nos[i]>key)
            {
                nos[i+1]=nos[i];
                i=i-1;
            }
            nos[i+1]=key;
        }
        for (i=nos.length-1;i>=0;i--)
        {
            System.out.print(nos[i]+" ");
        }
    }
}
