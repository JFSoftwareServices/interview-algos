package com.jfsoftware.interview.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tree {

    public static void main(String[] args) {
        Node<String> a = new Node<>("A");
        Node<String> b = new Node<>("B");
        Node<String> c = new Node<>("C");
        Node<String> d = new Node<>("D");
        Node<String> e = new Node<>("E");
        Node<String> f = new Node<>("F");
        Node<String> g = new Node<>("G");
        Node<String> h = new Node<>("H");
        Node<String> i = new Node<>("I");

        f.left = b;
        b.left = a;
        b.right = d;
        d.left = c;
        d.right = e;
        f.right = g;
        g.right = i;
        i.left = h;

        System.out.println("Pre Order Traversal");
        preOrderTraverse(f);

        System.out.println("\n");
        System.out.println("Iterative Pre Order Traversal");
        iterativePreOrderTraverse(f);

        System.out.println("\n");
        System.out.println("========");
        System.out.println();
        System.out.println("In Order Traversal");
        inOrderTraverse(f);

        System.out.println("\n");
        System.out.println("Iterative In Order Traversal");
        iterativeInOrderTraverse(f);

        System.out.println("\n");
        System.out.println("========");
        System.out.println();
        System.out.println("Post Order Traversal");
        postOrderTraverse(f);

        System.out.println("\n");
        System.out.println("Iterative Post Order Traversal");
        iterativePostOrderTraverse(f);

        System.out.println("\n");
        System.out.println("========");
        System.out.println();
        System.out.println("Level Order Traversal");
        levelOrderTraverse(f);

        System.out.println("\n");
    }

    // Left, Node, Right
    private static <T> void inOrderTraverse(Node<T> node) {
        if (node == null)
            return;

        inOrderTraverse(node.left);
        System.out.print(node.data + " ");
        inOrderTraverse(node.right);
    }

    private static <T> void iterativeInOrderTraverse(Node<T> node) {
        if (node == null)
            return;

        Stack<Node<T>> nodeStack = new Stack<>();
        Node<T> currentNode = node;

        // We traverse the tree
        while (currentNode != null || nodeStack.size() > 0) {
            // We try to reach the most left node of the current node
            while (currentNode != null) {
                // We add the pointer to the stack before traversing to the left node
                nodeStack.push(currentNode);
                currentNode = currentNode.left;
            }

            // Current Node is null a this point
            currentNode = nodeStack.pop();
            System.out.print(currentNode.data + " ");

            // Now, it's time to visit the right subtree
            currentNode = currentNode.right;
        }
    }

    // Node, Left, Right
    private static <T> void preOrderTraverse(Node<T> node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        preOrderTraverse(node.left);
        preOrderTraverse(node.right);
    }

    private static <T> void iterativePreOrderTraverse(Node<T> node) {
        if (node == null)
            return;

        Stack<Node<T>> nodeStack = new Stack<>();
        nodeStack.push(node);

        // We pop all items one by one.
        // For each item, we make the following steps : print data, push its right child, push its left child
        // We push right child in first for that left is processed first
        while (!nodeStack.empty()) {
            Node<T> currentNode = nodeStack.pop();
            System.out.print(currentNode.data + " ");

            if (currentNode.right != null)
                nodeStack.push(currentNode.right);

            if (currentNode.left != null)
                nodeStack.push(currentNode.left);
        }
    }

    // Left, Right, Node
    private static <T> void postOrderTraverse(Node<T> node) {
        if (node == null)
            return;

        postOrderTraverse(node.left);
        postOrderTraverse(node.right);
        System.out.print(node.data + " ");
    }

    private static <T> void iterativePostOrderTraverse(Node<T> node) {
        if (node == null)
            return;

        Stack<Node<T>> nodeStack1 = new Stack<>();
        Stack<Node<T>> nodeStack2 = new Stack<>();

        nodeStack1.push(node);

        while (!nodeStack1.isEmpty()) {
            Node<T> tmpNode = nodeStack1.pop();
            nodeStack2.push(tmpNode);

            if (tmpNode.left != null)
                nodeStack1.push(tmpNode.left);

            if (tmpNode.right != null)
                nodeStack1.push(tmpNode.right);
        }

        while (!nodeStack2.isEmpty()) {
            Node<T> tmpNode = nodeStack2.pop();
            System.out.print(tmpNode.data + " ");
        }
    }

    // https://tutorialedge.net/artificial-intelligence/breadth-first-search-java/
    private static <T> void levelOrderTraverse(Node<T> node) {
        if (node == null)
            return;

        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node<T> next = queue.remove();
            System.out.print(next.data + " ");

            if (next.left != null)
                queue.add(next.left);

            if (next.right != null)
                queue.add(next.right);
        }
    }

    static class Node<T> {
        T data;
        Node<T> left;
        Node<T> right;

        Node(T data) {
            this.data = data;
        }
    }
}