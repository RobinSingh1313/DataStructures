package LinkedList;

import java.util.Scanner;

public class InsertingBeginLinkedList {
    static class  Node
    {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }



    public static void main(String[] args) {
        Node head=null;
       head= insertdataatFirst(head,80);
        head= insertdataatFirst(head,80);
        head= insertdataatFirst(head,80);
        head= insertdataatFirst(head,80);
        head= insertdataatFirst(head,80);

        printLinkedList(head);


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

    private static Node insertdataatFirst(Node head,int datas) {


        Node curr=new Node(datas);

        curr.next=head;
        head=curr;

        return head;



    }


}
