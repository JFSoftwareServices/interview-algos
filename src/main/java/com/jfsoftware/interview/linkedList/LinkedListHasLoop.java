package com.jfsoftware.interview.linkedList;


/**
 * Given a linked list, check if the linked list has a loop or not.
 * <p>
 * if next of the tail node points to any of the previously present nodes in the list then it forms a loop
 * <p>
 * *******       ********       ********       ********       ********
 * 1  *------>*   2  *------>*   3  *------>*   4  *------>*  5   *
 * *******       ********       ********       ********       ********
 * ^                                               |
 * |                                               |
 * |_______________________________________________|
 * <p>
 * The solution is to move the slow pointer by one mode and the fast pointer by two nodes
 */

public class LinkedListHasLoop {

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
        node5.next = node2; // this cause linked list to have loop, cos of the point back to node2

        hasLoop(node1);
    }

    @SuppressWarnings("unchecked")
    private static <T> void hasLoop(Node<T> node) {
        Node<T> slowPointer = node;
        Node<T> fastPointer = node;

        /*
         * Exit condition checks fastPointer.next and fastPointer.next.next. This is because
         * fastPointer.next.next is called
         */
        while (fastPointer.next != null && fastPointer.next.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;

            if (slowPointer == fastPointer) {
                System.out.println("Linked list has loop");
                return;
            }
        }

        System.out.println("Linked list has no loop");
    }

    static class Node<T> {
        T data;
        Node next = null;

        Node(T data) {
            this.data = data;
        }
    }
}