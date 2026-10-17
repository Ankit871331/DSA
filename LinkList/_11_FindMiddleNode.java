package LinkList;

//11. Find Middle Node - Return middle. If even, return second middle. Hint: slow moves 1, fast moves 2. Input: 1->2->3->4->5 Output: 3. Input: 1->2->3->4 Output: 3

public class _11_FindMiddleNode {
    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node MiddleNode(Node head) {
    
        if(head == null){
            return null;
        }

        Node slow = head;
        Node fast = head;

        while (fast   != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
        
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);

        Node midNode = MiddleNode(head);
        System.out.println("node is which is middle: " + midNode.data); 
    }
}
