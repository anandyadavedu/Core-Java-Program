package LinkedList;

public class InsertAtFirst {
    Node head;

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void addFirst(int data) {
        // call the constructor via creating object of Node name

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;

        }
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is Empty:");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.print("Null");
    }

    public static void main(String[] args) {
        InsertAtFirst obj = new InsertAtFirst();

        obj.addFirst(3);
        obj.addFirst(2);
        obj.addFirst(1);
        obj.display();
    }
}
