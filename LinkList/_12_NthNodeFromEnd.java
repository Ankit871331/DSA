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

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(6);
        head.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next = new Node(9);
        head.next.next.next.next.next.next.next.next = new Node(10);
        head.next.next.next.next.next.next.next.next.next = new Node(11);

        int pos = 10;

        
        

        Node slow = head;
        Node fast = head;

        for(int i = 0; i<pos; i++){
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        System.out.println(slow.data);

    }
}
