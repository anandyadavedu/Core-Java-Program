package LinkedList;

public class Insertion {
    Node head;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
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

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // print the list

    public void printList() {
        if (head == null) {
            System.out.println("List is Empty ");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -->> ");
            currNode = currNode.next;
        }
        System.out.print("Null");
        System.out.println();
    }

    public static void main(String[] args) {

        Insertion list = new Insertion();

        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);

        list.printList();

        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.printList();
    }

}
