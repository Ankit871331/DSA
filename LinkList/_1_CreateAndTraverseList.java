package LinkList;

// 1. Create & Traverse List - Create a singly linked list from [1,2,3,4,5] and print all elements. Input: arr = [1,2,3,4,5] Output: 1 2 3 4 5


public class _1_CreateAndTraverseList {

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);

        ListNode current  = head;

        while(current != null){
            System.out.println(current.data);
            current = current.next;

        }

    }
}
