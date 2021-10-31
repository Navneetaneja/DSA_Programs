import java.util.*;
class Node{
    char data;
    Node next;
    ArrayList<Node> arr;
    Node(char data)
    {
        this.data=data;
        arr=new ArrayList<>();
        this.next=null;
    }
}
public class Main
{
    static Scanner sc=new Scanner(System.in);
    static Node list=null;
    static Node ptr=null;
    static void insertNew()
    {
        System.out.println("Enter element");
        Node e=new Node(sc.next().charAt(0));
        boolean flag=search(e.data);
        if(flag==false)
        {
        if(list==null)
        {
            list=e;
            ptr=e;
        }
        else{
            ptr.next=e;
            ptr=ptr.next;
        }
        }
        else{
            System.out.println("already present");
        }
        
    }
    static Node find=null;
    static boolean search(char e)
    {
        Node p=list;
        while(p!=null)
        {
            if(p.data==e)
            {
            find=p;
            return true;
            }
            p=p.next;
        }
        return false;
    }
    static void insert()
    {
        System.out.println("Enter element parent");
        char ch=sc.next().charAt(0);
        Node s=list;
        while(s!=null)
        {
            if(s.data==ch)
            {
                System.out.println("enter element");
                char c=sc.next().charAt(0);
                boolean flag=search(c);
                if(flag==false){
                Node e=new Node(c);
                s.arr.add(e);
                ptr.next=e;
                ptr=ptr.next;
                }
                else{
                    s.arr.add(find);
                    find=null;
                }
                break;
            }
            s=s.next;
        }
        if(s==null)
        System.out.println("Not found NOT inserted");
        
    }
    static void display()
    {
        Node s=list;
        while(s!=null)
        {
            System.out.print(s+" -> ");
            for(int i=0;i<s.arr.size();i++)
            {
                System.out.print(s.arr.get(i)+" ");
            }
            System.out.println();
            s=s.next;
        }
    }
	public static void main(String[] args) {
		int choice;
		do{
		    System.out.println("1. Insert New Element \t 2. Insert Adjacent Element \t 3. Display Graph \t 0.exit");
		    choice=sc.nextInt();
		    switch(choice)
		    {
		        case 1:
		            insertNew();
		            break;
		        case 2:
		            insert();
		            break;
		        case 3:
		            display();
		            break;
		        default:
		            return;
		    }
		}while(choice!=0);
	}
}
