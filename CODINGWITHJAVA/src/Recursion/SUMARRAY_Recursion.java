import java.util.Scanner;

public class SUMARRAY_Recursion {

    public static int Sum(int []arr,int st)
    {
        if(arr.length==st)
        {
            return 0;
        }
        return arr[st] + Sum(arr,st+1);

    }

    public static Boolean Check(int arr[],int t,int st)
    {
        if(st== arr.length)
            return false;
        if(arr[st]==t)
        {
            return true;

        }
        return Check(arr,t,st+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
//        System.out.println(Sum(arr,0));
        System.out.println(Check(arr,56,0));
    }
}
