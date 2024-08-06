public class CatchLoopDemo {
public static void main(String[] args) {
    try {
        int a=100/0;
    System.out.println(a);
    String name="Shakib Khan";
     int i=Integer.parseInt(name);
    System.out.println(i);
    int[] array={1,3,5,7};
    System.out.println(array[4]);
    String collegename=null;  
    System.out.println(collegename.length());
} catch(ArithmeticException arithmeticException){
    System.out.println(arithmeticException);
}
catch(NumberFormatException numberFormatException){
    System.out.println(numberFormatException);
}
catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
    System.out.println(arrayIndexOutOfBoundsException);
}
catch(NullPointerException nullPointerException){
    System.out.println(nullPointerException);
}
finally{
    System.out.println("abcd");
}
}
}
