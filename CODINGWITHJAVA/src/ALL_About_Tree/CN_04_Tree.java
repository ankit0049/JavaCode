package ALL_About_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CN_04_Tree {
    public static class TreeNode4<T>
    {
        T data;
                   /*                  NODE COUNT OF THE TREE                          */
                  /*              PRINT OR RETURN   LARGEST NODE OF THE TREE        */
        ArrayList<TreeNode4<T>> children;

        TreeNode4(T data)
        {
            this.data= data;
            children = new ArrayList<>();
        }
    }

    public static TreeNode4<Integer> takeInput()
    { Scanner sc =new Scanner(System.in);
         int n = sc.nextInt();
        Queue<TreeNode4<Integer>> q = new LinkedList<>();
        TreeNode4<Integer> root = new TreeNode4<Integer>(n);
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode4<Integer> temp = q.remove();
            int Child= sc.nextInt();
            for(int i=0; i<Child; i++)
            {
                int element = sc.nextInt();
                TreeNode4<Integer>ChildNode = new TreeNode4<>(element);
                temp.children.add(ChildNode);
                q.add(ChildNode);
            }
        }
     return root;
    }




    public static void print(TreeNode4<Integer> root)
    {
       Queue<TreeNode4<Integer>> q = new LinkedList<>();
       q.add(root);
       while(!q.isEmpty())
       {
           TreeNode4<Integer> Temp = q.remove();
           System.out.print(Temp.data + " : ");
           for(int i=0; i<Temp.children.size(); i++)
           {
               System.out.print(Temp.children.get(i).data + "  ");
               q.add( Temp.children.get(i));
           }
           System.out.println();
       }
    }



                      /*                   COUNT  NUMBER OF  NODES IN TREE                         */

    public static int NodeCount(TreeNode4<Integer>root)
    {
    int count=1;

        if(root==null)
        {
            return 0;
        }
        for(int i=0; i<root.children.size(); i++)
        {
            count+=NodeCount(root.children.get(i));
        }
        return count;
    }


    public static  int LargestCount(TreeNode4<Integer>root)
    {
        if(root==null)
            return 0;
        int max=root.data;
        for(int i=0; i<root.children.size(); i++)
        {
            max = Math.max(max,  LargestCount(root.children.get(i)));

        }
        return max;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode4<Integer>root = takeInput();
        int node_count = NodeCount(root);
        System.out.println(node_count);
        System.out.println(" Largest : "+ LargestCount(root));
    }
}
