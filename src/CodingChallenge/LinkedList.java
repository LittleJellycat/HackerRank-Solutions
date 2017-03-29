package CodingChallenge;

public class LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static Node insert(Node head, int data) {
        Node node = new Node(data);
        if (head == null) return node;
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
        return head;
    }
}
