package LinkedList;
/*
TimeComplesity:
add:depend upon tail or O(1)
add(index,element)-->O(n)
get,remove,contain-->O(n)
 */
public class SingleLinkedList {
    static class Node
    {
        Node next;
        int data;

         Node(int data) {
            this.data = data;
            next=null;
        }
    }

    public static void main(String[] args) {
        Node head=new Node(20);
        Node temp1=new Node(10);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.next=temp2;
        //printing
        printLinkedList(head);
        RecursiveprintLinkedList(head);



    }

    private static void printLinkedList(Node head) {
        Node cur=head;
        while (cur!=null)
        {
            System.out.print(cur.data+"-->");
            cur=cur.next;
        }
        System.out.println("null");
    }

    private static void RecursiveprintLinkedList(Node head) {
        if(head==null)
            return;
            System.out.print(head.data+"-->");
            RecursiveprintLinkedList(head.next);
        }

}
