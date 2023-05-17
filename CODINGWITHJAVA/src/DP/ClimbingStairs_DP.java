package DP;

import java.util.Scanner;

public class ClimbingStairs_DP {
    public static int Tabulation(int n )
    {if(n==0)return 1;
        if(n==1)return 1;
        int left = Tabulation(n-1);
        int right = Tabulation(n-2);
        return left+right;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = Tabulation(n);
        System.out.println(ans);
    }
}
