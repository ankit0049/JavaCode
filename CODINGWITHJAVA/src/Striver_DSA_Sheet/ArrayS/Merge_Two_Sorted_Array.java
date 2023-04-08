package Striver_DSA_Sheet.ArrayS;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_Two_Sorted_Array {
    public static void Sorted(int[]arr1 , int[]arr2)
    {
     int st=0;
     int end=arr1.length-1;
     int low=0;
     int high = arr2.length-1;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for(int i=0; i<m; i++)
        {
            arr2[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(arr1));
        System.out.println();
        System.out.print(Arrays.toString(arr2));
        System.out.println();
        Sorted(arr1,arr2);
        System.out.print(Arrays.toString(arr1));
        System.out.println();
        System.out.print(Arrays.toString(arr2));
    }
}
