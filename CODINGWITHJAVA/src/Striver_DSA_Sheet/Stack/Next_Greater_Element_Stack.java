package Striver_DSA_Sheet;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Next_Greater_Element_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        int a[] = new int [n];

        for(int i=2*n-1; i>=0; i--)
        {
            while(!st.empty() && arr[i%n]>=st.peek())
            {
                st.pop();
            }

            if(i<n)
            {
                if(st.empty()==false) {
                    a[i]=st.peek();
                }
                else {
                    a[i]=-1;
                }
            }
            st.push(arr[i%n]);
        }

        System.out.println(Arrays.toString(a));
    }
}
