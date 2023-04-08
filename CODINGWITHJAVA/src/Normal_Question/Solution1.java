package Normal_Question;

import java.util.Arrays;
import java.util.Scanner;

//class Solution1{
//   static public int[] leftRigthDifference(int[] nums) {
//        int left[] = new int [nums.length];
//        int right[] = new int [nums.length];
//        int sum1=0,sum2=0;
//
//        for(int i=1; i<nums.length;i++)
//        {
//            sum1=nums[i-1] + sum1;
//            left[i]=sum1;
//        }
//
//        for(int i=nums.length-2; i>=0;i--)
//        {
//           sum2=nums[i+1] + sum2;
//            right[i]=sum2;
//        }
//        for(int i=0; i<nums.length; i++)
//        {
//            nums[i]= Math.abs(left[i]-right[i]);
//        }
//        return nums;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int []arr = new int[n];
//        for(int i=0; i<n; i++)
//        {
//            arr[i]=sc.nextInt();
//        }
//        int ans[]=leftRigthDifference(arr);
//        System.out.println(Arrays.toString(ans));
//    }
//}

class Solution1{
    static public int[] leftRigthDifference(int[] nums) {

        int sum=0 ,sum1=0;
      int ans[] = new int[nums.length];
      for(int i=0; i< nums.length; i++)
      {
          ans[i]=nums[i];
      }
        for(int i=0; i<nums.length;i++)
        {
            sum=nums[i] + sum;
            sum1=nums[i] + sum1;
        }


        for(int i=0; i<nums.length; i++)
        {     sum = sum-nums[i];
             nums[i] = sum;
        }


        for(int i=0,j=nums.length-1;i<nums.length && j>0; i++ , j--)
        {   sum1=sum1-ans[j];
             ans[j]=sum1;

        }

        for(int i=0,j=nums.length-1;i<nums.length && j>0; i++ , j--)
 {
     nums[i]= Math.abs(nums[i]-ans[j]);
 }

        return nums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        int ans[]=leftRigthDifference(arr);
        System.out.println(Arrays.toString(ans));
    }
}