
import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> namelist=new ArrayList<>();
        namelist.add("Hamza");
        namelist.add("Ashmita");
        namelist.add("Anjali");
        namelist.add("Pratibha");
        namelist.add("Hamza");

       /*  for(String name : namelist)
        {
            System.out.println(name);
        }
        //to get the specific value using index
        System.out.println(namelist.get(1));
        //print the center value
        System.out.println(namelist.get(namelist.size()/2));
        Collections.sort(namelist);
        System.out.println(namelist);
        for(int i=namelist.size()-1; i>=0;i--)
        {
            System.out.println(namelist.get(i));
        }*/

        //duplicate 
        for(int i=0; i<namelist.size();i++)
        {
            for(int j=i+1;j<namelist.size();j++)
            {
                if(namelist.get(i).equals(namelist.get(j)))
                {
                    System.out.println(namelist.get(i));
                    
                    
                }
            }
        }
    }
}
