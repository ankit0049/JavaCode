import java.util.Scanner;

public class LEET {


        public boolean isPalindrome(String s) {
            int size=s.length()-1;
            if(size==0 )return true;
            StringBuilder osm = new StringBuilder();
            for(int i=0 ; i<s.length(); i++)
            {  int ans = (int)s.charAt(i);
                if((ans>=65 && ans<=90) || (ans>=97 && ans<=122))
                    osm.append(s.charAt(i));
            }

            s=osm.toString().toLowerCase();
            StringBuilder bkl = new StringBuilder();
            for(int i=s.length()-1; i>=0; i--)
            {
                bkl.append(s.charAt(i));
            }

            String str = bkl.toString();
            System.out.print(s.toString());
            System.out.println();
            System.out.println(str.toString());


            for(int i=0 ; i<s.length(); i++)
            {
                if(str.charAt(i)!=s.charAt(i))
                    return false;
            }

            return true;
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        LEET obj = new LEET();
        System.out.println( " Calling : " + obj.isPalindrome(str));
    }
}
