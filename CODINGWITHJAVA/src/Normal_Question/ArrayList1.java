import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0; i<n; i++)
        {
           int x = sc.nextInt();
           a.add(x);
        }

        System.out.println(a);
    }
}
