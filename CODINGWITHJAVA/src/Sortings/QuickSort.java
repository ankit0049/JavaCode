import java.util.ArrayList;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        int n = sc.nextInt();
        while(n>0)
        {
            int x = sc.nextInt();
            a.add(x);
            n--;
        }
        Quick(a,0,a.size()-1);
        System.out.println(a);

    }

    static  void Quick (ArrayList<Integer>a,int l,int h)
    {
        if(l>=h)
        {
            return ;
        }
        int st = l;
        int e =h;
        int mid = (st + (e-st)/2);
        int pivot = a.get(mid);
        while(st<=e) {
            while (a.get(st) < pivot) {
                st++;
            }
            while (a.get(e) > pivot) {
                e--;
            }
            if (st <= e) {
                int t = a.get(st);
                a.set(st, a.get(e));
                a.set(e, t);
                st++;
                e--;
            }
        }
        Quick(a,l,e);
        Quick(a,st,h);
    }
}
