package LinkList;

public class _8_DeleateAtTail {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        if (head == null) {
            System.out.println("null");
            return;
        }

        if (head.next == null) {
    head = null;
    System.out.println("null");
    return;
}

        Node currNode = head;

        while (currNode.next.next != null) {

            currNode = currNode.next;
        }
        currNode.next = null;

        Node h = head;
        while (h != null) {
            System.out.print(h.data + "->");
            h = h.next;
        }
        System.out.println("null");

    }
}
