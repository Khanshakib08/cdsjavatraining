
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVFile {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the file name:");
   String filename=sc.nextLine();
    File file=new File(filename+".csv");
    try {
        if(file.createNewFile())
        {
            System.out.println("File is Created");
        }
        else{
            System.out.println("File already exists");
        }

        if(file.exists())
       {  
       FileWriter writer = new FileWriter(filename+".csv");
           System.out.println("Write the message in your file");
           String message=sc.nextLine();
           writer.write(message);
           writer.close();
        }
        else{
            System.out.println("File not found");
        } 

        System.out.println("Enter your update message:");
        String update=sc.nextLine();
        FileWriter updateWriter=new FileWriter(file,true);
        updateWriter.append(", "+update);
        updateWriter.close();
    } catch (IOException ex) {
        throw new RuntimeException(ex);
    }
}
}
