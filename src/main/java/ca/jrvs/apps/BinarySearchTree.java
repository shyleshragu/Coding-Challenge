package ca.jrvs.apps;

import java.util.Stack;

/**
 * Implement a binary search tree
 * Implemented functions:
 * 1) getRoot() - returns root of binary tree
 * 2) isEmpty() - check if binary tree is empty or not
 * 3) size() - finds total number of nodes
 * 4) clear() - clear it
 */
public class BinarySearchTree {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.getRoot();
        System.out.println(tree.isEmpty());
        System.out.println(tree.size());
        tree.clear();
    }

    public static class Node {
        private int data;
        public Node left, right;

        public Node(int value) {
            data = value;
            left = right = null;
        }
    }

    public Node root;

    public BinarySearchTree() {
        root = null;
    }

    public Node getRoot() {
        return root;
    }

    /** * Java function to check if binary tree is empty or not
     * Time Complexity of this solution is constant O(1) for
     * best, average and worst case.
     *
     * @return true if binary search tree is empty
     */
    public boolean isEmpty() {
        return null == root;
    }

    /**
     * Java function to return number of nodes in this binary search tree.
     * Time complexity of this method is O(n)
     * @return size of this binary search tree
     */
    public int size() {
        Node current = root;
        int size = 0;
        Stack<Node> stack = new Stack<Node>();
        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            }
            else {
                size++;
                current = stack.pop();
                current = current.right;
            }
        } return size;
    }

    /**
     * Java function to clear the binary search tree.
     * Time complexity of this method is O(1)
     */
    public void clear() {
        root = null;
    }
}
