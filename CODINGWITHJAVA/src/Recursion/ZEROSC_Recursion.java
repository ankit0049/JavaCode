
import java.util.*;
public class ZEROSC_Recursion {
    private static int ZerosCheck(int n, int ans)
    {

        if(n==0) {
            return ++ans;
        }
        if(n/10==0)
            return ans;
       if(n%10==0)
           ans++;
       return ZerosCheck(n/10,ans);

    }
    public static int count(int n)
    {
        return ZerosCheck(n,0);
    }
    public static int ninja(int n)

    {          if(n<10)
           {
                   if(n==0)
                    return 1;
                   else
                    return 0;
            }

        if(n%10==0)
        return ninja(n/10)+1;
        return ninja(n/10);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(count(n));
        System.out.println(ninja(n));

    }
    }

