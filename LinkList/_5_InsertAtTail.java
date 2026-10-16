package LinkList;
// 5. Insert at Tail - Insert val at end. Input: head=1->2->3, val=4 Output: 1->2->3->4

public class _5_InsertAtTail {

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

        Node tail = new Node(4);

        if (head == null) {
            head = tail;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = tail;
        }

        Node current = head;

        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");

    }
}
