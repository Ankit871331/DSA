package LinkList;
//4. Insert at Head - Insert val at beginning. Input: head=2->3->4, val=1 Output: 1->2->3->4

public class _4_InsertAtHead {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(3);

        Node newNode = new Node(1);
        Node current = newNode;

        while (head != null) {
            current.next = head;
            head = head.next;
        }

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
            

        }

        Node c  = head;

        while (c != null) {
            System.out.println(c.data);
            c = c.next;
            
        }
    }
}
