

class Nested_if{
    public static void main(String[] args) {
        int a,b,c;
        a=12;
        b=19;
        c=16;
        if(a>b && a>c)
        {
            System.out.println("a="+a+" is largest");
        }
        else if(b>a && b>c)
        {
            System.out.println("b="+b+" is largest"); 
        }
        else 
        System.out.println("c="+c+" is largest");
    }
}