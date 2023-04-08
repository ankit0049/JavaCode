package Stack;
import java.util.*;
public class Implement_Using_ArrayList {
    public  static class Stack
    {
       static ArrayList<Integer> a = new ArrayList<>();
         static int top=-1;
        static  int size=0;

        public  static void push(int data)
        {   ++top;
            a.add(data);
            size++;
        }
        public  static int pop()
        {
           int data = a.remove(top);
           top--;
           return data;
        }
        public static int size()
        {
            return size;
        }

        public static int top()
        {
            return a.get(top);
        }

        public static void print()
        {
            while(top!=0)
            {
                System.out.print(a.get(top--)+ "  ");
            }
        }
    }
    public static void main(String[] args) {
        Stack obj = new Stack();
        obj.push(89);
        obj.push(18);
        obj.push(39);
        obj.push(59);
        obj.push(7);
        obj.push(990);
        obj.push(899);
        obj.push(878);
        obj.push(9);
        obj.pop();
        System.out.println(obj.top());
        System.out.println(obj.size());
       obj.print();
    }
}
