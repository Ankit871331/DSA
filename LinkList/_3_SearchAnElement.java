package LinkList;

// 3. Search an Element - Given x, return true if exists, else false. Input: head=1->2->3, x=3 Output: true. Input: head=1->2->3, x=7 Output: false


public class _3_SearchAnElement {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        int target = 300;

        Node current = head;
        boolean found = true;
        while (current != null) {
            if (target == current.data) {
                found = true;
            } else {

                found = false;
            }
            current = current.next;
        }

        if(found)
            System.out.println("found");
        else
            System.out.println("Not found");
    }
}
