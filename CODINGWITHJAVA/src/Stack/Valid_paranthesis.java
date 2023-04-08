package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Valid_paranthesis {

    public static boolean valid (String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char op = str.charAt(i);
            if (op == '{' || op == '(' || op == '[') {
                st.push(op);
            }
            if(st.empty())
            {
                return false;
            }
            if (op == '}' && st.peek() == '{') {
                st.pop();
            }  if (op == ')' && st.peek() == '(') {
                st.pop();
            } if (op == ']' && st.peek() == '[') {
                st.pop();
            }
        }
        return true;
    }
    public static void main(String[] args)
        {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(valid(str));
        }
    }

