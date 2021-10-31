import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Node{
    int data;
    Node prev;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
class Main
{
    public static void main(String[] args)
    {
        Node A=new Node(1);
        Node B=new Node(2);
        Node C=new Node(3);
        Node D=new Node(4);
        Node E=new Node(5);

        A.prev=null;
        A.next=B;
        B.prev=A;
        B.next=C;
        C.prev=B;
        C.next=D;
        D.prev=C;
        D.next=E;
        E.prev=D;
        E.next=null;

        B.prev.next=D;
        D.prev.next=B;

        Node swap=new Node(0);
        swap=B.prev;
        B.prev=D.prev;
        D.prev=swap;

        swap=D.next;
        D.next=B.next;
        B.next=swap;

        B.next.prev=B;
        D.next.prev=D;

        Node start=A;
        Node ptr=start;
        while(ptr!=null)
        {
            System.out.println(ptr.data);
            ptr=ptr.next;
        }

        // Write your code here
    }
}