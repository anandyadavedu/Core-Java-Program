package LinkedList;

public class AddAfter {
    Node head;

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addAfter(Node prev_node, int new_data) {
        if (prev_node.next == null) {
            System.out.println("previous node can't be null");
            return;
        }

        Node new_node = new Node(new_data);
        prev_node.next = new_node;
        new_node.next = prev_node.next;

    }

    public void addFirst(int data) {
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
            System.out.println("List is the empty");
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
        AddAfter list = new AddAfter();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.display();

    }
}
