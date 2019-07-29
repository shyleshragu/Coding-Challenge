package ca.jrvs.apps;

/**
 * Find the length of a Singly linked list.
 */

public class SinglyLinkedListSize {

    public static void main(String[] args) {
        // creating a singly linked list
        SinglyLinkedList.Node head = new SinglyLinkedList.Node(1);
        SinglyLinkedList linkedlist = new SinglyLinkedList(head);

        // adding node into singly linked list
        linkedlist.add(new SinglyLinkedList.Node(2));
        linkedlist.add(new SinglyLinkedList.Node(3));
        linkedlist.add((new SinglyLinkedList.Node(4)));
        // printing a singly linked list
        linkedlist.print();
        //printing the length of singly linked list
        linkedlist.size();
    }

}

class SinglyLinkedList {
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

    public SinglyLinkedList(Node head) {
        this.head = head;
    }

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

    public void print() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data() + " ");
            node = node.next();
        }
        System.out.println("");
    }

    /**
     * Counts the heads present in the list
     * Prints the length of the list
     */
    public void size(){
        Node temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        System.out.println("Size: " + count);
    }
}
