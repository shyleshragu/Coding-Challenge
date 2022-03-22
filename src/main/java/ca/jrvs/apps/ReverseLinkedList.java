package ca.jrvs.apps;

/**
 * Reverse singly linked list
 */
public class ReverseLinkedList {
    public static void main(String[] args) {

        // creating a singly linked list
        SinglyLinkedList3.Node head = new SinglyLinkedList3.Node(1);
        SinglyLinkedList3 linkedlist = new SinglyLinkedList3(head);

        // adding node into singly linked list
        linkedlist.add(new SinglyLinkedList3.Node(2));
        linkedlist.add(new SinglyLinkedList3.Node(3));
        linkedlist.add(new SinglyLinkedList3.Node(4));
        // printing a singly linked list
        linkedlist.print();

        // reversing the singly linked list
        linkedlist.reverse2();

        // printing the singly linked list again
        linkedlist.print();

    }

}

class SinglyLinkedList3 {
    static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public int data() {
            return data;
        }

        public Node next() {
            return next;
        }
    }

    private Node head;

    public SinglyLinkedList3(Node head) {
        this.head = head;
    }

    /**
     * Add an element to linked list
     * @param node
     */
    public void add(Node node) {
        Node current = head;
        while (current != null) {
            if (current.next == null) {
                current.next = node;
                break;
            }
            current = current.next;
        }
    }

    /**
     * Print a singly linked list
     */
    public void print() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data() + " ");
            node = node.next();
        }
        System.out.println("");
    }

    /**
     * Java method to reverse a linked list without recursion
     */
    public void reverse2() {
        Node pointer = head;
        Node previous = null, current = null;

        while (pointer != null) {
            current = pointer;
            pointer = pointer.next;

            // reverse the link
            current.next = previous;
            previous = current;
            head = current;
        }
    }
}
