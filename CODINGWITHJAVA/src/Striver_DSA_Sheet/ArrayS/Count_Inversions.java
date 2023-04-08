package Striver_DSA_Sheet.ArrayS;

import java.util.*;

public class Count_Inversions {

    public static int merge(int []arr, int left,int right ,int mid,int temp[] )
    { int count =0;
        int i=left;
        int j= mid;
        int k=left;

        while(i<=mid-1 && j<=right)
        {
            if(arr[i]<=arr[j])
            {
                temp[k++]=arr[i++];
            }
            else
            {
                temp[k++]=arr[j++];
                count=count+(mid-i);
            }
        }

        while(i<=mid-1)
        {
            temp[k++]=arr[i++];
        }

        while(j<=right)
        {
            temp[k++]=arr[j++];
        }
        return count;
    }
    public static int mergesort(int[]arr, int left, int right,int temp[])
    {
     int mid,count=0;
        if(right>left)
        {  mid = left +(right-left)/2;
            count += mergesort(arr,left,mid,temp);
            count += mergesort(arr,mid+1,right,temp);

            count+=merge(arr ,left,right,mid+1,temp);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i]= sc.nextInt();
        }
    int temp[]=new int [n];
        int ans = mergesort(arr,0,arr.length-1,temp);
        System.out.println(ans);
    }
}
