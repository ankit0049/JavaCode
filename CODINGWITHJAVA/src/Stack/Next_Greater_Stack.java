package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Stack {
  public static int[] Graeter(int arr[]) {
      int n = arr.length;
      int nge[] = new int[arr.length];
      Stack<Integer> st = new Stack<>();
      for (int i = 2 * n - 1; i >= 0; i--) {
          while (!st.empty() && arr[i % n] >= st.peek()) {
              st.pop();
          }

          if (i < n) {
              if (st.empty() == false)
                  nge[i] = st.peek();
              else
                  nge[i] = -1;
          }
          st.push(arr[i % n]);

      }
      return nge;
  }

        public static void main(String[] args) {
        int arr[] = {5,7,1,2,6,0};
        int arr2[]=Graeter(arr);
        for (int i=0; i< arr2.length; i++)
        {
            System.out.print(arr2[i] + " ");
        }
  }

}
