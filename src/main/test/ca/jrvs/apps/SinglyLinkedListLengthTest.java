package ca.jrvs.apps;

import org.junit.Test;

import static org.junit.Assert.*;

public class SinglyLinkedListLengthTest {
    @Test
    public void sizeTest() {
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
        assertEquals(4,linkedlist.size());
    }
}