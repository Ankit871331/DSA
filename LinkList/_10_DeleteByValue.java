package LinkList;

// 10. Delete by Value - Delete first occurrence of val. Input: head=1->2->3->2, val=2 Output: 1->3->2. Input: head=1->2->3, val=9 Output: 1->2->3 (no change)


public class _10_DeleteByValue {

    public static class Node{
        int data; 
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);


        int val = 1;

        if(head.data == val){
            head= head.next;
        }else{

        
        Node currentNode = head;
        Node prev = head;

        while(currentNode != null){
            if(currentNode.data == val){
                System.out.println("Deleated node  "  + currentNode.data);
                prev.next = currentNode.next;
                break;
            }
            prev = currentNode;
            currentNode = currentNode.next;
        }

    }
        Node c = head;

            while (c != null) {
                System.out.print(c.data + "->");
                c = c.next;
            }
            System.out.println("null");
        }

    }
