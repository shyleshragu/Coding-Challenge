package ca.jrvs.apps;

import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleofLinkedListTest {

    @Test
    public void middleoflinked() {
        SinglyLinkedList2.Node head = new SinglyLinkedList2.Node(1);
        SinglyLinkedList2 linkedlist = new SinglyLinkedList2(head);

        // adding node into singly linked list
        linkedlist.add(new SinglyLinkedList2.Node(2));
        linkedlist.add(new SinglyLinkedList2.Node(3));
        linkedlist.add((new SinglyLinkedList2.Node(4)));
        // printing a singly linked list
        linkedlist.print();

        assertEquals(3,linkedlist.middle());
    }

    @Test
    public void getmiddleTest() {
        SinglyLinkedList2.Node head = new SinglyLinkedList2.Node(1);
        SinglyLinkedList2 linkedlist = new SinglyLinkedList2(head);

        // adding node into singly linked list
        linkedlist.add(new SinglyLinkedList2.Node(2));
        linkedlist.add(new SinglyLinkedList2.Node(3));
        linkedlist.add((new SinglyLinkedList2.Node(4)));

        assertEquals(3, linkedlist.getMiddle(2));
    }

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