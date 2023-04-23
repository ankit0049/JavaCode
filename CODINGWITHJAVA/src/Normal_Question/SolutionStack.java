package Normal_Question;
import java.util.*;

public    class SolutionStack {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        int len = pushed.length;
        int j = 0;
        Stack<Integer> st = new Stack();
        for (int i = 0; i < len; i++) {
            st.push(pushed[i]);
            while (!(st.isEmpty()) && st.peek() == popped[j]) {
                j++;
                System.out.println(st.pop());
            }



        }

        return st.isEmpty();


        }

    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
         int arr2[]={4,5,3,2,1};
         boolean ans = validateStackSequences(arr,arr2);
        System.out.println(ans);
    }
    }

