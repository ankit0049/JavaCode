package ALL_About_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class CN_05_Tree {
    public static class TreeNode5<T>
    {
        T data;
        ArrayList<TreeNode5<T>> children;

                      /*                DEPTH OF THE NODE AT GIVEN K VALUE                */
                      /*                COUNT LEAF NODE OF THE TREE                       */


        TreeNode5(T data)
        {
            this.data=data;
            children = new ArrayList<>();
        }
    }
    public static TreeNode5<Integer> takeInput()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<TreeNode5<Integer>>q = new LinkedList<>();
        TreeNode5<Integer>root = new TreeNode5<>(n);
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode5<Integer> temp = q.remove();
            int childCount= sc.nextInt();
            for(int i=0; i<childCount; i++)
            {
                int data = sc.nextInt();
                TreeNode5<Integer>childNode = new TreeNode5<>(data);
                temp.children.add(childNode);
                q.add(childNode);
            }

        }
        return root;
    }

    public static  void depthofNode(TreeNode5<Integer>root , int k)
    {
         if(k<0)
             return ;
         if(k==0)
         {
             System.out.println(root.data);
             return;
         }

         for(int i=0; i<root.children.size(); i++)
         {
             depthofNode(root.children.get(i), k-1);
         }
    }



    public static int LeafNode(TreeNode5<Integer>root,int count)
    {

        for(int i=0; i<root.children.size(); i++) {

            if(root.children.size()==0)
            { ++count;
            }
            LeafNode(root.children.get(i),count);
        }
        return count;
    }
    public static void main(String[] args) {
        TreeNode5<Integer>root = takeInput();
        depthofNode(root ,1);
        System.out.println();
        System.out.println(LeafNode(root,0));
    }
}
