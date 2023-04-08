package ALL_About_Tree;

import java.util.LinkedList;
import java.util.*;

public class Alpha_02_Tree {
    public static  class Node
    {
        int data;
        Node left;
        Node right;                /* Top view Of the Tree Question Solution */

        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;

        }

    }
    public static  class Info
    {
        Node node;
        int hd;
        Info(Node node ,int hd)
        {
            this.node=node;
            this.hd=hd;
        }
    }

    public static void Topview (Node root)
    {
        Queue<Info>q = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();
        int min=0,max=0;
        q.add(new Info(root,0));
        q.add(null);

        while(!q.isEmpty()) {
            Info temp = q.remove();
            if (temp == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            }
            else {
            if (!map.containsKey(temp.hd)) {
                map.put(temp.hd, temp.node);
                            }
                if (temp.node.left != null) {
                    q.add(new Info(temp.node.left, temp.hd - 1));
                    min = Math.min(min, temp.hd - 1);
                                                       }

                if (temp.node.right != null) {
                    q.add(new Info(temp.node.right, temp.hd + 1));
                    max = Math.max(max, temp.hd + 1);
                                                  }
            }
        }
            for(int i=min; i<=max; i++)
            {
                System.out.print(   map.get(i).data + " ");
            }
    }





    public static void Bottomview (Node root) {
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info temp = q.remove();
            if (temp == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (map.containsKey(temp.hd)) {
                    map.put(temp.hd, temp.node);
                }
                if (temp.node.left != null) {
                    q.add(new Info(temp.node.left, temp.hd - 1));
                    min = Math.min(min, temp.hd - 1);
                }

                if (temp.node.right != null) {
                    q.add(new Info(temp.node.right, temp.hd + 1));
                    max = Math.max(max, temp.hd + 1);
                }
            }
        }
            for(int i=max; i>=min; i--)
            {
                System.out.print(   map.get(i).data + " ");
            }

    }
    public static void main(String[] args) {
        Node root = new Node(1);
         root.left= new Node(2);
         root.left.left = new Node(3);
         root.left.right = new Node(4);
         root.right = new Node (5);
         root.left.right=new Node (6);
         root.right.right = new Node(7);
       //  Topview(root);
        Bottomview(root);
    }
}
