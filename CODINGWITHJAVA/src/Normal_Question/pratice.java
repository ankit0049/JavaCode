package Normal_Question;

import java.util.Scanner;

public class pratice {
    static  boolean ans=false;
    public static  void fun(int[]arr , int target , int idx,int n)
    {
        if(idx==n)
        {
            if(target==0)
            {
                ans = true;

            }
            return ;
        }
        if(target-arr[idx]>=0){
        target=target-arr[idx];}
        fun(arr,target,idx+1,n);
        target=target+arr[idx];
        fun(arr,target,idx+1,n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        int arr[]= new int [n];
        for(int i=0; i<n; i++)
        {
            arr[i]= sc.nextInt();

        }

        System.out.println(" Enter Your Target : ");
        int target = sc.nextInt();
        fun(arr,target,0,n);
        System.out.println(ans);
    }
}
