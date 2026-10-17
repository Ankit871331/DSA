package LinkList;

public class _9_DeleateAtPosition {

    // 9. Delete at Position - Delete node at 0-based index pos. Handle head
    // deletion and invalid positions. Input: head=1->2->3->4, pos=1 Output:
    // 1->3->4. Input: head=1->2->3, pos=0 Output: 2->3

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
        head.next.next.next = new Node(4);

        if (head == null) {
            System.out.println("nulll");
            return;
        }

        int pos = 2;
        int count = 0;
        Node c = head;
        while (c != null) {
            count++;
            c = c.next;
        }

        if (pos < 0  || pos >= count) {
            System.out.println("Invalid position");
            return;
        }else if(pos == 0){
            head = head.next;
        }

        Node currentNode = head;
        int countNode = 0;
        while (currentNode != null) {
            
            if(pos -1 == countNode){
                System.out.println("node deleated " + currentNode.next.data);
                currentNode.next = currentNode.next.next;
                
            }
            countNode++;
            currentNode = currentNode.next;
        }

        Node d = head;
        while (d != null) {
            System.out.print(d.data + "->");
            d = d.next;
        }
        System.out.println("null");

    }
}
