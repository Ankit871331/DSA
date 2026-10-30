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

        Node start = new Node(1);
        start.next = head;

        Node dummy = start;

        while(dummy != null){
            System.out.println(dummy.data);
            dummy = dummy.next;
        }
        System.out.println("done");

    }

}
