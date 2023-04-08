package ALL_About_Tree;

public class Binary_Tree_Avilabel_Node {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            Node left = null;
            Node right = null;
        }
    }

    public static class Searching_Node {
        static int idx = -1;

        public static Node BuildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node temp = new Node(nodes[idx]);
            temp.left = BuildTree(nodes);
            temp.right = BuildTree(nodes);
            return temp;
        }

        public static boolean Search_Node(Node root, int k) {
            if(root==null)
            {
                return false;
            }
            if (root.data == k) {
                return true;
            }
            return Search_Node(root.left, k) || Search_Node(root.right, k);
      }


        public static  void preorder(Node root)
        {        if(root==null)
            return;
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
   }

    public static void main(String[] args) {
     //   int []nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
      //  int[] nodes={5,6,10 ,2, 3, -1, -1, -1, -1, -1, 9, -1, -1};
        int nodes[] ={2 ,4, 5, 6, -1, -1, 7 ,20, 30, 80, 90, -1, 8, 9, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
        Searching_Node obj = new Searching_Node();
        Node root = obj.BuildTree(nodes);

        obj.preorder(root);
        System.out.println();
        System.out.println( obj.Search_Node(root,7));
    }
}
