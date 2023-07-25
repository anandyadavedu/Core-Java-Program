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

public class CountNode {
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

    // Method for Count Number of Node

    public static int countNode(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNode = countNode(root.left);
        int rightNode = countNode(root.right);

        return leftNode + rightNode + 1;
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // BuildBinaryTree tree = new BuildBinaryTree();

        Node root = buildTree(nodes);
        // root.data gives data of root node
        System.out.println(root.data);

        // Call the countNode function to count Node
        System.out.println(countNode(root));
    }
}
