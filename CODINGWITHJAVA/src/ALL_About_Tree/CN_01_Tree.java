package ALL_About_Tree;

import java.util.ArrayList;

public class CN_01_Tree {
    public static class TreeNode1<T> {
        T data;
        ArrayList<TreeNode1<T>> children;

        TreeNode1(T data) {
            this.data = data;
            children = new ArrayList<>();
        }
    }                              /*    Tree Creation and Take input then Print()  */

    public static void main(String[] args) {
        TreeNode1<Integer> root = new TreeNode1<>(45);
        TreeNode1<Integer> node1 = new TreeNode1<>(4);
        TreeNode1<Integer> node2 = new TreeNode1<>(46);
        TreeNode1<Integer> node3 = new TreeNode1<>(49);
        TreeNode1<Integer> node4 = new TreeNode1<>(84);

        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node2.children.add(node4);

        System.out.println(root.data);

    }
}
