package ca.jrvs.apps;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class DesignLinkedListTest {

    @Test
    public void designedlinkedlist(){
        LinkedList linkedList2 = new LinkedList();
        linkedList2.add(1);
        linkedList2.add(3);

        DesignLinkedList linkedList = new DesignLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);

        assertEquals(linkedList2.get(0), linkedList.get(0));
        assertEquals(linkedList2.get(1), linkedList.get(1));

        linkedList.addAtIndex(1, 2);  //linked list becomes 1->2->3
        assertEquals(2,linkedList.get(1));            //returns 2

        linkedList.deleteAtIndex(1);  //now the linked list is 1->3
        assertEquals(3,linkedList.get(1));  //returns 3
    }
}
