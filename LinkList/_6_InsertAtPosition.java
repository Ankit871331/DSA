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

        int count = 0;
        Node dommy = new Node(0);
        dommy.next = head;
        Node d = dommy;
        while (count != pos) {

            d = d.next;
            count++;
        }
        Node p = d.next;
        d.next = val;
        val.next = p;

        Node k = head;

        while (k != null) {
            System.out.println(k.data);
            k = k.next;
        }

    }
}
