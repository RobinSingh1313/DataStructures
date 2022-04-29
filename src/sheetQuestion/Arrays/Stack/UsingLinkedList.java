package sheetQuestion.Arrays.Stack;

import java.util.HashMap;

public class UsingLinkedList {

    static class Node
    {
        int data;
        Node next;

        public  Node(int data)
        {
            this.data=data;
            next=null;
        }


    }


   public   static  class stack
    {
        public static   Node head;


        static  boolean isEmpty()
        {
            return  head==null;
        }
         static  void  push(int data)
        {
            Node node=new Node(data);
            if (isEmpty())
            {
                head=node;
                return;
            }
            node.next=head;
            head=node;

        }
        public  static  int pop()
        {
            if (isEmpty())
                return -1;
            int top= head.data;
            head=head.next;return top;
        }
        public  static  int peek()
        {
            if (isEmpty())
                return -1;
            return head.data;

        }
    }

    public static void main(String[] args) {
        int n=9 >>0;
        HashMap<Integer,Integer> hash=new HashMap<>();
        int[] k={1,2,2};
        for(int s:k)
        {

        }
        //10001
        System.out.println(n);
        System.out.println(n&1);
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while (!s.isEmpty())

        {
            System.out.println(s.peek());
            s.pop();

        }
    }
}
