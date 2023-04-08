import java.util.Scanner;

public class GEOMETRIC_Recursion {

    public static double geometric(int n) {
        if (n == 0){
            return 1;
    }

       return geometric(n-1)+1/Math.pow(2,n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc . nextInt();
        System.out.println( geometric(n));

    }
}
