package ca.jrvs.apps;
/**
 * Design a linked list where a node in it should have two attributes:
 * val: value of current node
 * next: pointer/reference to the next node
 * If double linked list is used, then an additional attribute:
 * prev - indicates the previous node
 *
 * functions implemented in class:
 * 1) get(index): get value of index, if index is invalid return -1
 * 2) addAtHead(val): add at first element
 * 3) addAtTail(val): add at last element
 * 4) addAtIndex(index, val): add val before the index. if index > length of list, then do not add
 * if index was negative, then inserted at the head
 * 5) deleteAtIndex(index): delete the index node if the index is valid
 */
public class DesignLinkedList {
    private class Node{
        public int val ;
        public Node next;

        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public Node dHead;
    public int size;

    /**
     * Initializing data.
     * */
    public DesignLinkedList() {
        dHead = new Node(0);
        size=0;
    }

    /**
     * note: use debug to clarify whether it worked or not
     */
    public static void main(String[] args) {
        DesignLinkedList linkedList = new DesignLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1, 2);  //linked list becomes 1->2->3
        linkedList.get(1);            //returns 2
        linkedList.deleteAtIndex(1);  //now the linked list is 1->3
        linkedList.get(1);  //returns 3
    }

    public void printList(){

    }
    /**
     * Get the value of the index-th node in the linked list.
     * @return -1 if index is invalid
     * */
    public int get(int index) {
        System.out.println("size:" + size);
        if(index<0 || index>=size)
            return -1;

        Node cur = dHead.next;
        for(int i=0 ; i<index ; i++)
            cur= cur.next;
        return cur.val;
    }

    /**
     * Add a node of value val before the first element of the linked list.
     * After the insertion, the new node will be the first node of the linked list.
     * */
    public void addAtHead(int val) {
        Node cur = new Node(val);
        cur.next = dHead.next;
        dHead.next = cur;
        size++;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     * */
    public void addAtTail(int val) {
        Node node = new Node(val);
        Node cur = dHead.next;

        for(int i=0 ; i<size-1; i++)
            cur = cur.next;

        cur.next = node;
        size++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list.
     * If index equals to the length of linked list, the node will be appended to the end of linked list.
     * If index is greater than the length, the node will not be inserted.
     * */
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size)
            return ;

        Node node = new Node(val);
        Node pre = dHead;
        for(int i=0 ;i<index; i++)
            pre=pre.next;

        node.next = pre.next;
        pre.next = node;
        size++;
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     * */
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size)
            return ;

        Node pre = dHead;
        for(int i=0  ;i<index ;i++)
            pre = pre.next;

        pre.next =  pre.next.next;
        size--;
    }

    public String toString(){

        StringBuilder res = new StringBuilder();

        Node cur = dHead.next;
        while(cur!=null){
            res.append(cur+"->");
            cur = cur.next;
        }
        res.append("Null");

        return res.toString();
    }
}

