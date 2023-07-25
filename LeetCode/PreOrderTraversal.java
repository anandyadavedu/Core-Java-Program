package LeetCode;

import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class PreOrderTraversal {
    static int idx = -1;

    // Build Pre-Order Tree because we pass in main
    // method preorder tree
    public static Node buildTree(int nodes[]) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }

    public static List<Integer> preorder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }
        list.add(root.data);
        preorder(root.left);
        preorder(root.right);

        return list;

    }

    public static void main(String[] args) {
        int[] nodes = { 1, -1, 2, 3 };
        Node root = buildTree(nodes);

        System.out.println(preorder(root));

    }

}
