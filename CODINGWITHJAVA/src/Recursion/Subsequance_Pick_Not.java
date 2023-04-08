package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Subsequance_Pick_Not {
    public static void sub (int []a , ArrayList<Integer> arr, int idx , int n  )
    {

        if(idx>=n)
        { System.out.println(arr.toString());
            return;
        }
        arr.add(a[idx]);
        sub(a,arr,idx+1,n);
        arr.remove(arr.size()-1);
        sub(a,arr,idx+1,n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]= { 1 ,2, 3};
       ArrayList<Integer>arr = new ArrayList<>();
        sub(a , arr , 0 , a.length);
    }
}
