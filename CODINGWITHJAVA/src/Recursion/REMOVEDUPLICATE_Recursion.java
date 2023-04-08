import java.util.*;
public class REMOVEDUPLICATE_Recursion {
    public static StringBuilder remove(StringBuilder str, int st,int ans )
    {
        if(st==str.length())
        {
            return str;
        }

        if(str.charAt(st)==ans)
        {
            ans=str.charAt(st);
            str.deleteCharAt(st);
        }
        return remove(str,++st,ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String st= sc.nextLine();
       StringBuilder str = new StringBuilder(st);
       remove(str,0,0);
    }
}
