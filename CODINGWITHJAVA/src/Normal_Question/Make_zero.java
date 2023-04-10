package Normal_Question;

import java.util.Scanner;

public class Make_zero {
    public  static int zero(int[]arr,int cn)
    {
       int min = minimum(arr);

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]-min>=0)
            {
                arr[i]=arr[i]-min;
            }
        }
        cn++;
        for(int x=0; x< arr.length; x++)
        {
            if(arr[x]!=0) {
                zero(arr,cn);
            }
        }
  return cn;
    }
    public static int minimum(int []arr)
    {
        int min=Integer.MAX_VALUE;
        for(int i=1; i< arr.length; i++)
        {
            if( arr[i]!=0 && min>=arr[i] )
                min=arr[i];

        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        System.out.println(zero(arr,0));
    }
}
