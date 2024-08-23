
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingExample {
public static void main(String[] args) {
   //1. To Create the file :- filename and extension
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the file name:");
   String filename=sc.nextLine();
    File file=new File(filename+".txt");
    try {
        if (file.createNewFile())
        {
            System.out.println("File is created");
        }
        else{
            System.out.println("File already exists");
        }
        //2. To write the data in your file
       // Write the file using filename and extension
       if(file.exists())
       {  
       FileWriter writer = new FileWriter(filename+".txt");
           System.out.println("Write the message in your file");
           String message=sc.nextLine();
           writer.write(message);
           writer.close();
        }
        else{
            System.out.println("File not found");
        } 

        // 3. Read the file using scanner
        Scanner reader= new Scanner(file);
        String data="";
        while(reader.hasNextLine()){
            data =reader.nextLine();
        }
        System.out.println(data);


        // 4. to update the file
        System.out.println("Enter your update message:");
        String update=sc.nextLine();
        FileWriter updateWriter=new FileWriter(file,true);
        updateWriter.append(" "+update);
        updateWriter.close();

        System.out.println("Enter the keyword you want to search:");
        String search=sc.nextLine();
        if(data.contains(search))
        {
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }

    } catch (IOException ex) {
        throw new RuntimeException();
    }
    
}
}
