package LinkList;

// 6. Insert at Position - Insert val at 0-based index pos. Handle pos=0 and pos=length. Input: head=1->2->4, val=3, pos=2 Output: 1->2->3->4. Input: head=1->2->3, val=0, pos=0 Output: 0->1->2->3

public class _6_InsertAtPosition {
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
        head.next.next = new Node(4);

        int pos = 2;
        Node val = new Node(3);

        Node current = head;
        int count = 0;

        while (current != null) {

            if (pos-1 == count) {
                val.next = current.next;
                current.next = val;
            } else {
                current = current.next;

            }
            count++;

        }

        Node h = head;

        while (h != null) {

            System.out.print(h.data + "->");
            h = h.next;
        }
        System.out.println("null");

    }
}
