package BinarytreeAlgo;

import java.util.*;

// Node class for all new node generate
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// Another class is insert
// this class operate all operation
public class BinaryTree {

    // Buildtree method is used to build
    // tree this is help take input from
    // user here we all nodes provided
    // at once and pass to build method
    // to gernerate tree
    static int idx = -1;

    public static Node buildTree(int[] nodes) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        // taking newNode as a variable which
        // hold the root node of tree
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes); // build left subtree of root
        newNode.right = buildTree(nodes);// build right subtree of root

        return newNode; // return root node

    }
    // here we create a PreOrder method to print
    // nodes data in preorder
    // 1. Root
    // 2. Left Subtree
    // 3. Right subtree

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Now we make a Inorder method
    // 1. left subtree
    // 2. root
    // 3. right subtree

    public static void inorder(Node root) {
        if (root == null) {
            return;

        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Now we make the Postorder method
    // to print nodes data in postorder

    // 1.left subtree
    // 2.right subtree
    // 3.root

    public static void postorder(Node root) {
        if (root == null) {
            return;

        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // here we make a Level order method
    // this method is Access data from level wise

    // level order is BFS traversal implement by Quiue data structure

    public static void levelorder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null); // represent next line in this code
        while (!q.isEmpty()) {

            Node currNode = q.remove();// take a currnode which hold the firsty root

            // currnode is null the check Quiue is empty or not
            // if empty then break;
            // otherwise add another null in quiue
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            }
            // if Not empty the print currnode and
            // also add left and right subtree of currnode
            // if exist
            else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // BinaryTree tree = new BinaryTree();
        // create an object of BinaryTree class
        Node root = buildTree(nodes); // Take a root Node which hold the root Node
        System.out.println(root.data + " "); // Here we print root node of given nodes

        // call the preorder method
        System.out.println("Pre order traversal of given nodes is- ");
        preorder(root);
        System.out.println();

        // Now call the inorder metoid
        System.out.println("Inorder traversal of given nodes is- ");
        inorder(root);
        System.out.println();

        // call the post order method
        System.out.println("Postorder traversal of given nodes is -");
        postorder(root);
        System.out.println();

        // call the level order method
        System.out.println("Level order traversal of given nodes is -");
        levelorder(root);
    }

}
