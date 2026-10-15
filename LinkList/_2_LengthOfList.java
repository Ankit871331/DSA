package LinkList;

// 2. Length of List - Return the number of nodes. Do iteratively, then recursively. Input: 1->2->3->4->5 Output: 5



public class _2_LengthOfList {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node head  = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        Node current = head;
        int count = 0;

        while(current != null){
            count++;
            current = current.next;
        }

        System.out.println(count);
    }
}
