package LinkedList;

public class Singly_LinkedList_Creation {

    public  static class Node
    {
        int d;
        Node next;

        Node(int data)
        {
            this.d = data;
            next = null;
        }
    }
    public static Node head;
    public static  Node tail;
    static int size=0;
    public static void InsertHead(int data)
    {    Node temp = new Node(data);
        if(head==null)
        {
            head=tail=temp;
        }
        else {
            temp.next = head;
            head = temp;
        } ++size;
    }

    public static void InsertTail(int data)
    {
        Node temp = new Node(data);
        if(head==null)
        {
            head=tail=temp;
        }
        else {
            tail.next=temp;
            tail=temp;
        }
        ++size;
    }

    public static  void InsertPosition( int data , int pos)
    {
        if(pos==1)
        {
            InsertHead(data);
        }
        else if(pos-1==size+1)
        {
            InsertTail(data);
        }else{
        Node temp=head;
        int cnt=1;
        while(cnt<pos)
        {

            temp=temp.next;
            ++cnt;
        }
        Node tempnode = new Node(data);
        tempnode.next=temp.next;
        temp.next = tempnode;}
        ++size;

    }
    public  static  void print()
    {
        Node temp = head;
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
        print();
        InsertTail(100);
        InsertTail(500);
        print();
        InsertPosition(999,8);
        print();
        System.out.println(" Size  : "+size);

    }

}
