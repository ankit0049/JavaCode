import java.util.Scanner;

public class TABLE_Recursion {
    public static  void table(int n,int x)
    {
        if(x>10)
            return;
        int ans = n*x;
        System.out.println(ans);
        table(n,++x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int x = sc.nextInt();
        table(x,1);
    }
}
