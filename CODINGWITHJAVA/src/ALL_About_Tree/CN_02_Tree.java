package ALL_About_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CN_02_Tree {
    public static class TreeNode2<T>
    {
        T data;
        ArrayList< TreeNode2<Integer>> children;

        TreeNode2(T data)
        {
            this.data= data;
            children = new ArrayList<>();
        }
    }
                            /*      Recursion Using Tree  input then Print()      */

    public static TreeNode2 takeinput(Scanner sc)
    {
        int n = sc.nextInt();
        TreeNode2<Integer> root = new TreeNode2<>(n);
        int childCount=sc.nextInt();
        for(int i=0; i<childCount; i++)
        {
            TreeNode2<Integer> child= takeinput(sc) ;
            root.children.add(child);
        }
        return root;
    }

    public static void print(TreeNode2<Integer> root) {
        System.out.print(root.data + ": ");
        for(int i=0; i<root.children.size(); i++)
        {
            System.out.print(root.children.get(i).data + ",");
        }
        System.out.println();
        for(int i=0; i<root.children.size(); i++)
        {
            print(root.children.get(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode2<Integer>root =takeinput(sc);
        print(root);
    }
}
