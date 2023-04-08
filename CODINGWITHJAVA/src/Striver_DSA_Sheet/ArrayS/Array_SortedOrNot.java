package Striver_DSA_Sheet;
import java.util.*;
public class Array_SortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
                int n= sc.nextInt();
                int arr[]= new int [n];
        int min=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0; i<n; i++)
                {
                      arr[i]= sc.nextInt();
                      if(min>arr[i])
                      {
                          min=arr[i];
                          index=i;
                      }
               }

        for( int i=index; i<n; i++)
        {
            if(arr[i%n]<arr[(i+1)%n])
            {
                continue;
            }
            else
            {
                System.out.println("false");
                break;
            }
        }

    }
}
