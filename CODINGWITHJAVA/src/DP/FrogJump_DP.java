package DP;

import java.util.Scanner;

public class FrogJump_DP {
    public static int Tabulation(int n ,int[]arr)
    {if(n==0)return 1;
        if(n==1)return 1;
        int left = Tabulation(n-1,arr);
        int right = Tabulation(n-2,arr)+Math,abs(arr[]);
        return left+right;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = Tabulation(n,arr);
        int arr[] = new int [n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
    }
}
