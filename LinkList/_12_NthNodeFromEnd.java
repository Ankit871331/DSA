package LinkList;

public class _12_NthNodeFromEnd {

    // 12. Nth Node from End - Return Nth node from end in one pass. Hint: gap of N
    // between two pointers. Input: head=1->2->3->4->5, N=2 Output: 4

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node findVal(Node head, int pos) {
        if (head == null || pos <= 0) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        for (int i = 0; i < pos; i++) {
            if (fast == null)
                return null;
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(42);

        Node found = findVal(head, 2);
        System.out.println(found.data);

    }
}
