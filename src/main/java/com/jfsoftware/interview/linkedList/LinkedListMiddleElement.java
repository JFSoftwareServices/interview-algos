package com.jfsoftware.interview.linkedList;


/**
 * Given a linked list, find the middle node. In this example the middle node is 3 and it contains 300.
 * *******       ********       ********       ********       ********
 * 1  *------>*   2  *------>*   3  *------>*   4  *------>*  5   *
 * *******       ********       ********       ********       ********
 * The solution is to move the slow pointer by one mode and the fast pointer by two nodes.
 * When the fast pointer can't be moved any further than then the position of the slow pointer is in the middle node
 */


public class LinkedListMiddleElement {

    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(100);
        Node<Integer> node2 = new Node<>(200);
        Node<Integer> node3 = new Node<>(300);
        Node<Integer> node4 = new Node<>(400);
        Node<Integer> node5 = new Node<>(500);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        middleElement(node1);
    }

    private static void middleElement(Node<Integer> node) {
        Node slowPointer = node;
        Node fastPointer = node;

        /*
         * Exit condition checks fastPointer.next and fastPointer.next.next. This is because
         * fastPointer.next.next is called
         */
        while (fastPointer.next != null && fastPointer.next.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }

        System.out.println("Middle element in linked list is: " + slowPointer.data);

    }

    static class Node<T> {
        T data;
        Node next = null;

        Node(T data) {
            this.data = data;
        }
    }
}