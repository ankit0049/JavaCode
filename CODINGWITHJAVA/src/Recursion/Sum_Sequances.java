package Recursion;
import java.util.*;
class Sum_Sequances
{  public  static  void fun(int ind , int[]arr , int target , int n ,int sum , ArrayList<Integer>a)
{
    if(ind==n)
    {
        if(target==sum)
        {
            System.out.println(a.toString());
        }
        return;
    }
    a.add(arr[ind]);
    sum+=arr[ind];

    fun(ind+1,arr ,target,n,sum,a);
    sum=sum-arr[ind];
    a.remove(a.size()-1);

    fun(ind+1,arr,target,n, sum,a);
}
    public static void main(String[] args) {
        int []arr = { 1, 4 , 9 , 5 ,8};
        int target = 18;
         fun(0 , arr, target,arr.length ,0,new ArrayList<>());
    }
}