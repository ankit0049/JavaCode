import java.util.*;

public class REPLACE_Recursion {
    public static StringBuilder rep(StringBuilder s, char t , char y , int st)
    {
        if(st==s.length())
            return s;
        if(s.charAt(st)==t)
        {
            s.setCharAt(st,y);
        }
       return  rep(s,t,y,++st);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String scr = sc.nextLine();
        StringBuilder str = new StringBuilder(scr);

          char target = 'a';
          char replace = 'x';
        System.out.println(rep(str , target , replace,0));

    }
}
