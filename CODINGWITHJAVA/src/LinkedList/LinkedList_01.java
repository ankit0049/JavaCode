package LinkedList;

public class LinkedList_01 {

    public static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
         this.data = data;
         this.next = null;
        }
    }
    public  static  Node head;
    public static  Node tail;
    public static  int size=0;
        public static void insertFirst(int data)
        {
            Node temp  = new Node(data);
            if(head==null)
            {

                head=tail=temp;
                ++size;
                return;
            }
            temp.next=head;
            head= temp;
            ++size;
        }

        public static void insertlast(int data )
        {     Node temp  = new Node(data);
            if(head==null)
            {
                temp=tail;
                tail=temp;
            }
            tail.next = temp;
            tail=temp;
            ++size;
        }

        public static void insertPosition(int data , int position)
        {
            Node temp = new Node(data);
         if(position==1)
         {
             insertFirst(data);

         }
         else if(position==size)
         {
             insertlast(data);
         }
         else
         {  int count=1;
            Node tp = head;
             while(count<position)
             {   tp= tp.next;
                 ++count;

             }
             Node host = new Node(data);
             host.next = tp.next;
             tp.next = host;
             ++size;

         }

        }
     public static void Reverse()
     {    Node prev=null;
         Node next;
         Node curr=tail=head;

         while(curr!=null)
         {
             next = curr.next;
             curr.next=prev;
             prev=curr;
             curr=next;
         }
         head=prev;
     }
        public void print()
        {
            Node temp = head;
            while(temp!=null)
            {
                System.out.print(temp.data + " ");
                temp= temp.next;
            }
            System.out.println();
        }

    public static void main(String[] args) {
        LinkedList_01 obj = new LinkedList_01();
        obj.insertFirst(7);
        obj.insertFirst(87);
     ;  obj.print();

        obj.insertlast(1000);
        obj.insertlast(89);
        obj.print();


        System.out.println( " Size : "+ size);


        obj.insertPosition(99999,1);
        obj.print();
        System.out.println( " Size : "+ size);


        obj.insertPosition(888888,4);
        obj.print();
        System.out.println( " Size : "+ size);


        obj.Reverse();
        obj.print();

        obj.insertPosition(809809,3);
        obj.print();
        System.out.println("Size :"+ size);
        obj.insertPosition(10979,7);
        obj.print();
        System.out.println("Size :"+ size);


    }
}
