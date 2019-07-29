package ca.jrvs.apps;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class ReverseLinkedListTest{

    @Test
    public void reverse2() {
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
        linkedlist.print();
    }
}