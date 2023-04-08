import java.util.Scanner;

public class DIGIT_Recursion {
  static int c=0;
    public static  int digit(long x)
    {
        if(x==0)
            return 0;
        digit(x/10);
        return ++c;
    }
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        long n = scc.nextLong();
        System.out.println(digit(n));

    }
}
