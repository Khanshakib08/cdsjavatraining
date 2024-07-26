

public class ClassObjects {
public static void main(String[] args) {
    Trainer t=new Trainer();
   /*  t.trainerName="Pawan Sharma";
    t.trainerTechnology="Java";
    System.out.println("Trainer Name is : "+t.trainerName+"\nTrainer technology is : "+t.trainerTechnology);*/
   /*  Scanner sc=new Scanner(System.in);
    System.out.println("Enter the trainer name:");
    t.trainerName=sc.nextLine();
    System.out.println("Enter the trainer's technology:");
    t.trainerTechnology=sc.nextLine();

    Student s=new Student();
    System.out.println("\nEnter the student name:");
    s.studentName=sc.nextLine();
    System.out.println("Enter the student's enrolled technology:");
    s.enrolledTechnology=sc.nextLine();
    t.nameConcatenation("Pawan", "Sharma");*/
    Student s=new Student();
    s.setStudentName("Shakib Khan");
    s.setEnrolledTechnology("JAVA");
    System.out.println(s.getStudentName()+" "+s.getEnrolledTechnology());
}
}
class Trainer{
    String trainerName;
    String trainerTechnology;

    public static void nameConcatenation(String fname,String lname){
        System.out.println(lname+" "+fname);

    }
}

class Student{
    String studentName;
    String enrolledTechnology;
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getEnrolledTechnology() {
        return enrolledTechnology;
    }
    public void setEnrolledTechnology(String enrolledTechnology) {
        this.enrolledTechnology = enrolledTechnology;
    }
}
