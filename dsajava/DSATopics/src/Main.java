import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    String[] nameArray;
    nameArray=new String[]{"Shakib Khan","Sabi","Hamza","Asmita","Anjali"};
    // print specific String
        System.out.println(nameArray[1]);
        // print all string
        for(String name:nameArray)
        {
            System.out.println(name);
        }
        System.out.println("<--Data in reverse order-->");
        for(int i= nameArray.length-1;i>=0;i--)
        {
            System.out.println(nameArray[i]);
        }

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Shakib");
        arrayList.add("Sabi");
        arrayList.add("Hamza");
        arrayList.add("Saif");
        System.out.println(arrayList);

       int arr[][][]={{{1,2,3},{4,5,6},{7,8,9}}};
//       for (int i=0; i<3; i++)
//       {
//           for (int j=0; j<3; j++)
//           {
//               for (int k=0; k<3; k++)
//               {
//                   System.out.print(arr[i][j][k]);
//               }
//               System.out.println();
//           }
//       }
        System.out.println("<--Reverse order-->");
        for (int i=arr.length-1; i>=0; i--)
        {
            for (int j=arr[i].length-1; j>0; j--)
            {
                for (int k=arr[i][j].length; k>0; k--)
                {
                    System.out.print(arr[i][j][k]);
                }
                System.out.println();
            }
        }
    }
}