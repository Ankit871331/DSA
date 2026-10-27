package LinkList;

public class _13_RemoveNthNodeFromEnd {
    // 13. Remove Nth Node from End - Delete Nth from end. Handle N=length. Input:
    // head=1->2->3->4->5, N=2 Output: 1->2->3->5. Input: head=1->2->3, N=3 Output:
    // 2->3

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node deleteNode(Node head, int pos) {
        if (head == null || pos <= 0)
            return null;

        Node slow = head;
        Node fast = head;

        for (int i = 0; i < pos; i++) {
            if (fast == null)
                System.out.println("null");
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        Node c = fast;
        while (c != null) {
            System.out.print(c.data + "->");
            c = c.next;

        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        deleteNode(head, 3);
    }
}
