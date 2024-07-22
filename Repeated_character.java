class Repeated_character{
    public static void main(String[] args) {
        String word="ambassador";
        int n;
        char cword[]=word.toCharArray();
        for(int i=0; i<word.length();i++)
        {
            n=1;
            
            for(int j=i+1; j<word.length();j++)
            {
                if(cword[i]==cword[j])
                {
                n++;
                cword[j]='0';
                }
            }
            if(n>1 && cword[i]!='0')
            System.out.println(word.charAt(i)+" occurs "+n+" times.");
            
        }
    }
}