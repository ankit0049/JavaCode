package Normal_Question;

public class Subsequance {
    public static void main(String[] args) {
        String str = "abc";
        int n = str.length();
        for(int i=0; i<(1<<n); i++)
        { String s="";
            for(int j=0; j<n; j++)
            {
               if((i & (1<<j))!=0)
               {
                 s= s+str.charAt(j);
               }
            }
            System.out.println(s);
        }
    }
}
