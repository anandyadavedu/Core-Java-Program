package BinarytreeAlgo;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BuildBinaryTree {
    static int idx = -1;

    // Build Pre-Order Tree because we pass in main
    // method preorder tree
    public static Node buildTree(int[] nodes) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // BuildBinaryTree tree = new BuildBinaryTree();

        Node root = buildTree(nodes);
        System.out.println(root.right.data);
    }

}
