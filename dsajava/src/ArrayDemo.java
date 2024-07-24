public class ArrayDemo {
    public static void main(String[] args) {
        String[] friendNames={"Ashmita","Anjali","Pratibha","Adarsh","Shakib"};
        System.out.println(friendNames[0]);
        System.out.println(friendNames.length);
        friendNames[4]="Hamza";
       /*  for(int i=0; i<friendNames.length;i++)
        {
            System.out.println(friendNames[i]);
        }*/
        for( String name:friendNames)
        {
            System.out.println(name);
        }

    }
    
}
