package ALL_About_Tree;
public class Alpha_01_Tree {
    public static class Node
    {
        int data;
        Node left;
        Node right;
                            /* Alpha Binary Tree All type Traversal  */
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static  class BinaryTree
    {   static  int idx =-1;
        public static Node BuildTree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
                return null;
            Node temp = new Node(nodes[idx]);
            temp.left = BuildTree(nodes);
            temp.right = BuildTree(nodes);
            return temp;
        }
        public static  void preorder(Node root)
        {        if(root==null)
                   return;
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static  void Inorder(Node root)
        {
            if(root==null)
                return;
            Inorder(root.left);
            System.out.print(root.data + " ");
            Inorder(root.right);
        }

        public static  void postorder(Node root)
        {
           if(root==null)
               return;
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        int []nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree obj = new BinaryTree();
        Node root = obj.BuildTree(nodes);
        System.out.println(root.data);
        obj.preorder(root);
        System.out.println();
        obj.Inorder(root);
        System.out.println();
        obj.postorder(root);
    }
}
