package ca.jrvs.apps;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicateNodeTest {

    @Test
    public void removeDuplicateNodeTest() {
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