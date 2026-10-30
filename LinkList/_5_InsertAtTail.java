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


    Node newNode = new Node(3);

    Node dummy = head;

    while(dummy.next != null){
        dummy = dummy.next;
    }
    dummy.next = newNode;

    Node d = head;

    while(d != null) {
        System.out.println(d.data);
        d = d.next;
    }
}


}
