package Stack;

import java.util.LinkedList;

public class Implement_Using_LinkedList {
    public static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data= data;
            this.next=null;
        }
    }
    public static Node Head;
    public static Node tail;
    public static int size=0;

    public static class LinkedList
    {
      public static void push(int data)
      {  Node temp = new Node(data);
          if(Head==null)
          {
              Head=tail=temp;
          }
         else  {
              temp.next = Head;
              Head = temp;

          }
          size++;
      }


      public static int pop()
      {
          if(Head==null)
          {
              return 0;
          }
          int ans= Head.data;
          Head=Head.next;
          size--;
          return ans;
      }

      public static int top()
      {
          return Head.data;
      }

      public static int size()
      {
          return size;
      }

      public static void print()
      {
          Node temp = Head;
          while(temp!=null)
          {
              System.out.print(temp.data + "  ");
              temp=temp.next;
          }
          System.out.println();
      }
    }

    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.push(78);
        obj.push(10);
        obj.push(69);
        obj.push(99);

        obj.print();
        System.out.println( " pop    :" +obj.pop());
        System.out.println( " size   :" +obj.size());
        System.out.println( "  top   :"+ obj.top());

    }
}
