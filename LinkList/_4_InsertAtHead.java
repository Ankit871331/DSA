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
        newNode.next = head;
        head = newNode;

        Node current = head;

        while(current != null){
            System.out.print(current.data + " ->");
            current = current.next;
        }
        System.out.println("null");
        
    }
}
