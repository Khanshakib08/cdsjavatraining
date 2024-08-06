public class ExceptionHandlingDemo {
public static void main(String[] args) {
   // int a=100/0;
    //System.out.println(a);
   /*Problem statement 1-> arithematic exception */ 
    try {
        int a=100/0;
    System.out.println(a);
    } catch (Exception e) {
        System.out.println(e);
    }
   /*Problem statement 2-> NumberFormatException */
    String name="Shakib Khan";
   // int i=Integer.parseInt(name);
   // System.out.println(i);
    try {
        int i=Integer.parseInt(name);
    System.out.println(i);
    } catch (Exception e) {
        System.out.println(e);
    }
    /*problem statement 3-> ArrayIndexOutOfBoundsException*/
    int[] array={1,3,5,7};
    try {
        System.out.println(array[4]);
    } catch (Exception e) {
        System.out.println(e);
    }
    
    /*Problem statement 4-> NullPointerException*/
    String collegename=null;   
    try {
        System.out.println(collegename.length());
    } catch (Exception e) {
        System.out.println(e);
    }
}
}
