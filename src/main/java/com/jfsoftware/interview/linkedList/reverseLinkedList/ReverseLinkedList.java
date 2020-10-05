package com.jfsoftware.interview.linkedList.reverseLinkedList;


/**
 * Given a pointer to the head node of a linked list, the task is to reverse the linked list.
 * We need to reverse the list by changing links between nodes.
 *
 * Read Attached doc on how this works..... It's tricky.
 */
public class ReverseLinkedList {

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

        reverseLinkedList(node1);
    }

    private static void reverseLinkedList(Node<Integer> head) {
        Node current = head;
        Node previous = null;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        while (previous != null) {
            System.out.println(previous.data);
            previous = previous.next;
        }

    }

    static class Node<T> {
        T data;
        Node next = null;

        Node(T data) {
            this.data = data;
        }
    }
}
