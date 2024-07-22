class Reverse_String{
    public static void main(String[] args) {
        String name = "Shakib";
        for(int i=name.length()-1; i>=0; i--)
        {
            System.out.print(name.charAt(i)); 
        }
    }
}