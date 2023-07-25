package BinarytreeAlgo;

// First Method to created a Pre-Order Tree 
// by passing data before execution

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Tree {
    Node root;

    Tree() {
        root = null;
    }

    // preOrder traversal algo

    public static void traversePreorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        traversePreorder(node.left);
        traversePreorder(node.right);
    }

    // InOreder traversal algo

    public static void traverseInorder(Node node) {
        if (node == null) {
            return;
        }
        traverseInorder(node.left);
        System.out.print(node.data + " ");
        traverseInorder(node.right);
    }

    // Post order traversal algo
    public static void traversePostorder(Node node) {
        if (node == null) {
            return;
        }
        traversePostorder(node.left);
        traversePostorder(node.right);
        System.out.print(node.data + " ");
    }

    // Here we call the function
    // inorder, preorder,postorder

    void traversePreorder() {
        traversePreorder(root);
    }

    void traverseInorder() {
        traverseInorder(root);
    }

    void traversePostorder() {
        traversePostorder(root);
    }

    public static void main(String[] args) {
        Tree pt = new Tree();
        pt.root = new Node(1);
        pt.root.left = new Node(2);
        pt.root.left.left = new Node(3);
        pt.root.right = new Node(4);
        pt.root.right.right = new Node(5);

        System.out.println();

        System.out.println("PreOrder traversal is-" + " ");
        pt.traversePreorder();

        System.out.println();

        System.out.println("InOrder traversal is-" + " ");
        pt.traverseInorder();

        System.out.println();

        System.out.println("Post Order traversal is-");
        pt.traversePostorder();

    }
}

