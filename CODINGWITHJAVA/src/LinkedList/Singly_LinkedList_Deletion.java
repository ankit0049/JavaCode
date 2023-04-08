package LinkedList;

public class Singly_LinkedList_Deletion {


    public  static class Node
    {
        int d;
        Singly_LinkedList_Creation.Node next;

        Node(int data)
        {
            this.d = data;
            next = null;
        }
    }
    public static Singly_LinkedList_Creation.Node head;
    public static Singly_LinkedList_Creation.Node tail;
    static int size=0;
    public static void InsertHead(int data)
    {    Singly_LinkedList_Creation.Node temp = new Singly_LinkedList_Creation.Node(data);
        if(head==null)
        {
            head=tail=temp;
        }
        else {
            temp.next = head;
            head = temp;
        } ++size;
    }
   public  static int DeletionHead()
   {
       int data = head.d;
       head=head.next;
       return data;
   }
   public static  int DeletionTail()
   {
       int data= tail.d;
       tail=tail.next;
       return data;
   }

    public  static  void print()
    {
        Singly_LinkedList_Creation.Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.d + " ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertHead(8);
        InsertHead(87);
        InsertHead(69);
        InsertHead(49);
        InsertHead(999);
        print();
        System.out.println(" Size  : "+size);
        System.out.println(  DeletionHead());
        print();
        System.out.println(  DeletionTail());
        print();

    }
}
