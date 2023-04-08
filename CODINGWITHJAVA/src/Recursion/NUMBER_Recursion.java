import java.util.Scanner;

public class NUMBER_Recursion {

    public  static void Numberprint(int n)
    {
        if(n==1)
            return ;

        Numberprint(--n);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        Numberprint(n);
    }
}
