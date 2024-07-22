class Method{
    public void area(int r)
    {
        double a=Math.PI*r*r;
        System.out.println("Area of circle="+a);
    }
    public static void main(String[] args) {
        Method m=new Method();
        m.area(10);
    }
}