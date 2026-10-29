package LinkList;

// 2. Length of List - Return the number of nodes. Do iteratively, then recursively. Input: 1->2->3->4->5 Output: 5

public class _2_LengthOfList {

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
        head.next.next.next  = new Node(4);

        int count = 0;

        Node dummy = head;

        while(dummy != null){
            count++;
            dummy = dummy.next;
        }

        System.out.println(count+1);

    }
}
