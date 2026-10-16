package LinkList;
// 7. Delete at Head - Remove first node. Handle empty. Input: head=1->2->3 Output: 2->3. Input: head=null Output: null

public class _7_DleateAtHead {

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

        if (head == null) {
            System.out.println("null");
            return;
        }

        head = head.next;
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("null");
    }
}
