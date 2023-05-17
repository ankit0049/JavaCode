package DP;

import java.util.Scanner;

public class Fibbonacci_DP {

    public static int Memoization(int n)
    {
        if(n<=1)
            return n;
        return Memoization(n-1)+Memoization(n-2);
    }

    public static  int Tabulation(int n,int arr[])
    {
       arr[0]=0;
       arr[1]=1;
       for(int i=2; i<=arr.length;i++)
       {
           arr[i]=arr[i-1]+arr[i-2];
       }
       return arr[n];
    }
    public static void main(String args[])
    { Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

         // This is the part of Memoization
        int ans = Memoization(n);
        System.out.println(ans);

        // This is the Tabulation Form of The Program
        int arr[] = new int [n+1];
        int ans2 =Tabulation(n,arr);
        System.out.println(ans2);

    }
}
