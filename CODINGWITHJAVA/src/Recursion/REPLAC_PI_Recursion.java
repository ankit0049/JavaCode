import java.util.Scanner;

public class REPLAC_PI_Recursion { public static  String op ="pi";
    public static StringBuilder replace(StringBuilder str,StringBuilder s,int e )

    {
       if(e==str.length())
       {
           return str;
       }
       s.append(str.charAt(e));
       if(s.equals(op))
       {
           str.replace('p','i',"3.14");
       }
       if(s.equals(op) && s.length()==2)
       {
           s.delete(0,s.length());
       }
       return replace(str,s,++e);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        StringBuilder str = new StringBuilder(st);
        StringBuilder s = new StringBuilder("");
        System.out.println(replace(str,s,0));
    }
}
