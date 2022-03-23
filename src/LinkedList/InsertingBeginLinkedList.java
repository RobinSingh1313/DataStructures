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
       head=insertdataEnd(head,90);

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

    public  static  Node deleteNode(Node head,int pos)
    {

        if (head==null)
            return null;
        else return head.next;

    }
    public  static  Node insertdataEnd(Node head,int data)
    {
        Node curr=new Node(data);
        if (head==null)
            return  curr;
        Node currs=head;
        while (currs.next!=null)
        {


            currs=currs.next;
        }
        currs .next=curr;

        return  head;
    }

    private static Node insertdataatFirst(Node head,int datas) {


        Node curr=new Node(datas);

        curr.next=head;
        head=curr;

        return head;



    }


}
