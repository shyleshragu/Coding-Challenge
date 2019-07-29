package ca.jrvs.apps;

import org.junit.Test;
import ca.jrvs.apps.BinarySearchTree.Node;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {


    @Test
    public void binaryTest(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.getRoot();
        assertFalse(tree.isEmpty());
        assertEquals(5,tree.size());

        tree.clear();
    }


    @Test
    public void isEmptyTestTrue() {
        BinarySearchTree tree = new BinarySearchTree();
        assertTrue(tree.isEmpty());
    }

    @Test
    public void clearTest(){
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new Node(1);

        tree.clear();
        assertTrue(tree.isEmpty());
    }
}