package ALL_About_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CN_03_Tree {
    public static class Node<T>
    {
        T data;          /*           LEVEL WISE TAKE INPUT OF THE TREE         */
                        /*           LEVEL WISE TRAVERSAL OR LEVEL WISE PRINT   */

        ArrayList<Node<Integer>> childre;

        Node(T data)
        {
            this.data= data;
            childre = new ArrayList<>();
        }
    }
            /*      Tree Level wise Input       */

           /*       Tree Level order Traversal  */

    public static Node<Integer> LevelwiseInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr root data");
        int rootdata = sc.nextInt();
        Queue< Node<Integer>> q = new LinkedList<>();
         Node<Integer> root = new  Node<>(rootdata);
        q.add(root);
        while(!q.isEmpty())
        {
            Node<Integer> temp = q.remove();
           int childCount = sc.nextInt();

          for (int i = 0; i < childCount; i++) {
            int data = sc.nextInt();
            Node< Integer > childNode= new Node<Integer>(data);
            temp.childre.add(childNode);
            q.add(childNode);
        }
    }
    return root;
    }
    public static void Levelwiseprint(Node<Integer>root)
    {
        Queue<Node<Integer>> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node<Integer> temp = q.remove();
            System.out.print(temp.data + " : ");
            for(int i=0; i<temp.childre.size(); i++)
            {
                System.out.print(temp.childre.get(i).data + " ");
                q.add(temp.childre.get(i));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Node<Integer> root = LevelwiseInput();

        //   input  :  1 2 2 3 2 4 5 3 6 7 8 1 9 0 0 0 0 0

        /*
                       1
                    /     \
                   2        3
                  / \    /  |  \
                 4   5  6   7    8
                /
                9                      */


        Levelwiseprint(root);
    }
}
