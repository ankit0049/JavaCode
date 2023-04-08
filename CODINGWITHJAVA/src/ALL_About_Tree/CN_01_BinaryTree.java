package ALL_About_Tree;

import java.util.Scanner;

public class CN_01_BinaryTree {
    public static class Tree1<T> {
        T data;
        Tree1 left;
        Tree1 right;

                 /*            Binary Tree User Input          */
                /*              Inorder Traversal or Print     */
        Tree1(T data) {
            this.data = data;
            Tree1 left = null;
            Tree1 right = null;
        }
    }

    public static class BinaryTree {
        public Tree1<Integer> Buildtree(Scanner sc) {
            int n = sc.nextInt();
            if (n == -1)
                return null;
            Tree1<Integer> root = new Tree1<Integer>(n);
            root.left = Buildtree(sc);
            root.right = Buildtree(sc);

            return root;
        }




}
    public static  void Inorder(Tree1<Integer>root)
    {
        if(root==null)
            return;
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tree1<Integer> root = new Tree1<>(1);
        Tree1<Integer> node1 = new Tree1<>(2);
        Tree1<Integer> node2 = new Tree1<>(3);
        Tree1<Integer> node3 = new Tree1<>(4);
        Tree1<Integer> node4 = new Tree1<>(5);
        Tree1<Integer> node5 = new Tree1<>(6);
        Tree1<Integer> node6 = new Tree1<>(7);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;

        Inorder(root);

    }
}
