package LinkedList;

public class CompleteSingleLinkedList {
    Node head;
    class  Node
    {
        Node next;
        String val;

        public Node(String val) {
            this.val = val;
            this.next=null;
        }



    }
    public void   insertFirst(String val)
    {
        Node  newnode=new Node(val);

        if (head==null)
        {
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;


    }

    public  void addlast(String data)
    {
        Node newnode=new Node(data);
        Node currNode = head;
        while (currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=newnode;



    }
public  void deleteFirst()
{
    Node cuurNode=head;
    head=cuurNode.next;
}
public  void insertMedium( String va)
{
    Node currNode=head;
    if (currNode.val.equals(va))
        head=currNode.next;
    Node lastNode=currNode.next;
    while (lastNode!=null)
    {
        if(lastNode.val.equals(va))
        {
            currNode.next=lastNode.next;
            return;

        }
        currNode=lastNode;
        lastNode=lastNode.next;

    }

}
public  void deletelast()
{
    Node currNode=head;
    while (currNode.next.next!=null)
    {
        currNode=currNode.next;
    }
    currNode.next=null;
}
public  void insertMiddle(String val,String item)
{
    Node prevNode=head;
    Node currNode=prevNode.next;
    while (currNode.next!=null)
    {
        if(currNode.val.equals(val))
        {


        }
    }
}
    public  void printedList()
    {
        if (head==null)
        {
            System.out.println("It is Empty");
        }
        Node currNode=head;
        while (currNode!=null)
        {
            System.out.print(currNode.val+"-->");
            currNode=currNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        CompleteSingleLinkedList ll=new CompleteSingleLinkedList();
        ll.insertFirst("A");
        ll.insertFirst("B");
        ll.addlast("C");
        ll.printedList();
        ll.insertMedium("A");
        ll.printedList();

    }

}
