package ca.jrvs.apps;

/**
 * Find a middle node of a singly linked list
 * if there are gtwo middle nodes, then return the second one
 */
public class MiddleofLinkedList {
    public static void main(String[] args) {
        // creating a singly linked list
        SinglyLinkedList2.Node head = new SinglyLinkedList2.Node(1);
        SinglyLinkedList2 linkedlist = new SinglyLinkedList2(head);

        // adding node into singly linked list
        linkedlist.add(new SinglyLinkedList2.Node(2));
        linkedlist.add(new SinglyLinkedList2.Node(3));
        linkedlist.add((new SinglyLinkedList2.Node(4)));
        // printing a singly linked list
        linkedlist.print();

        linkedlist.middle();
    }
}

class SinglyLinkedList2 {
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

    public SinglyLinkedList2(Node head) {
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
     * Finds the middle number in singly linkedlist
     * methods: middle() and getmiddle()
     */
    public void middle(){
        int len = size();
        System.out.println("middle node: " + getMiddle(len/2));
    }

    public int getMiddle(int len){
        Node fast = head;
        Node slow = head;
        int start = 1;

        while (fast.next != null){
            fast = fast.next;
            start++;

            if (start > len)
                slow = slow.next;
        }
        return slow.data;
    }

    public int size(){
        Node temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
