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

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        int pos = 3;

        Node slow = head;
        Node fast = head;

        for (int i = 0; i <= pos; i++) {
            fast = fast.next;

        }

    
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;


        Node currNode = head;

        while (currNode != null) {
            System.out.println(currNode.data);
            currNode  = currNode.next;
        }

    
    }
}
