package ca.jrvs.apps;

/**
 * Remove duplicate nodes in an unsorted linked list
 */
public class RemoveDuplicatNode {
    public static void main(String[] args) {
        // creating a singly linked list
        SinglyLinkedList4.Node head = new SinglyLinkedList4.Node(1);
        SinglyLinkedList4 linkedlist = new SinglyLinkedList4(head);

        // adding node into singly linked list
        linkedlist.add(new SinglyLinkedList4.Node(1));
        linkedlist.add(new SinglyLinkedList4.Node(3));
        linkedlist.add(new SinglyLinkedList4.Node(3));
        // printing a singly linked list
        linkedlist.print();

        // reversing the singly linked list
        linkedlist.removeDuplicateNode();

        // printing the singly linked list again
        linkedlist.print();
    }
}
class SinglyLinkedList4 {

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

    public SinglyLinkedList4(Node head) {
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
     * Print a linked list
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
     * Remove duplicate indexes
     */
    public void removeDuplicateNode(){
        Node node1 = head;
        Node node2 = null;
        Node dup;

        while (node1 != null && node1.next != null){
            node2 = node1;
            while (node2.next != null){
                if (node1.data == node2.next.data){
                    dup = node2.next;
                    node2.next = node2.next.next;
                    System.gc();
                }
                else
                    node2 = node2.next;
            }
            node1 = node1.next;
        }
    }
}
