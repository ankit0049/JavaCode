import java.util.Scanner;

public class PALLINDROME_Recursion {
    public  static Boolean check(String str , int s ,int e,int m)
    {
        if(s==m)
        {   return true;}
        if(str.charAt(s)!=str.charAt(e))
            return false;
        return check(str,++s,--e,m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int st=0,e=str.length()-1;
        int mid = st + (e-st)/2;
        System.out.println(check(str,0,str.length()-1,mid));
    }
}
