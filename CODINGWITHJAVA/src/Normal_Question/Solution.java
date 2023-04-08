
package Normal_Question;
import java.util.*;
/* public  class Solution {
    public static String displayScreen(String s) {
        Stack<Character> st = new Stack<Character>();

        for(int i=0; i<s.length(); i++)
        {    if(s.charAt(i)!='B')
            st.push( s.charAt(i) );
        else
        {   if(!st.empty()) {
            st.pop();
        }
        }
        }

        StringBuilder op = new StringBuilder() ;

        while(!st.empty())
        {
            op.append(st.pop());
        }

        String opp = op.toString();
        return opp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  str = sc.nextLine();
        System.out.println(displayScreen(str));

    }
}*/

class Solution {
    public static int longestConsecutive(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i]==nums[i-1] || nums[i]-1==nums[i-1])
            {
                count++;
            }
            else
            {
                break;
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
        int arr[] = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(arr));
    }
}