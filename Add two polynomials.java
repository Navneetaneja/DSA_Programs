import java.util.Scanner;
class Node{
    int power,coeff,flag=0;
    Node next;
}
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Node p1=null,ptr1=null;
        Node p2=null,ptr2=null;
        int power,coeff;
        do{
            System.out.println("Enter power of polynomial 1");
            power=sc.nextInt();
            System.out.println("Enter Coefficient of polynomial 1");
            coeff=sc.nextInt();
            Node poly=new Node();
            poly.power=power;
            poly.coeff=coeff;
            poly.next=null;
            if(p1==null)
            {
                ptr1=poly;
                p1=poly;
            }
            else{
                ptr1.next=poly;
                ptr1=ptr1.next;
            }
            
        }while(power!=0);
        
        do{
            System.out.println("Enter power of polynomial 2");
            power=sc.nextInt();
            System.out.println("Enter Coefficient of polynomial 2");
            coeff=sc.nextInt();
            Node poly=new Node();
            poly.power=power;
            poly.coeff=coeff;
            poly.next=null;
            if(p2==null)
            {
                ptr2=poly;
                p2=poly;
            }
            else{
                ptr2.next=poly;
                ptr2=ptr2.next;
            }
            
        }while(power!=0);
        
        Node ptr=p1;
        while(ptr!=null)
        {
            System.out.print(ptr.coeff+"x^"+ptr.power+" ");
            ptr=ptr.next;
        }
        System.out.println();
        ptr=p2;
        while(ptr!=null)
        {
            System.out.print(ptr.coeff+"x^"+ptr.power+" ");
            ptr=ptr.next;
        }
        System.out.println();
        Node start=p1;
        Node ans=null; 
        Node ansptr=null;
        while(start!=null)
        {
            Node s=p2;
            Node ansnode=new Node();
            while(s!=null)
            {
                if(s.power==start.power)
                {
                    if(ans==null)
                    {
                    ansnode.coeff=start.coeff+s.coeff;
                    ansnode.power=start.power;
                    ansnode.next=null;
                    ans=ansnode;
                    ansptr=ans;
                    }
                    else{
                    ansnode.coeff=start.coeff+s.coeff;
                    ansnode.power=start.power;
                    ansnode.next=null;
                    ansptr.next=ansnode;
                    ansptr=ansptr.next;
                    }
                    start.flag=1;
                    s.flag=1;
                    break;
                }
                s=s.next;
            }
            if(s==null)
            {
                ansnode.power=start.power;
                ansnode.coeff=start.coeff;
                ansnode.next=null;
                if(ans==null)
                {
                    ans=ansnode;
                    ansptr=ans;
                }
                else{
                    ansptr.next=ansnode;
                    ansptr=ansptr.next;
                }
                start.flag=1;
            }
            start=start.next;
        }
        start=p2;
        while(start!=null)
        {
            if(start.flag==0)
            {
            Node s=p1;
            Node ansnode=new Node();
            while(s!=null)
            {
                if(s.power==start.power)
                {
                    if(ans==null)
                    {
                    ansnode.coeff=start.coeff+s.coeff;
                    ansnode.power=start.power;
                    ansnode.next=null;
                    ans=ansnode;
                    ansptr=ans;
                    }
                    else{
                    ansnode.coeff=start.coeff+s.coeff;
                    ansnode.power=start.power;
                    ansnode.next=null;
                    ansptr.next=ansnode;
                    ansptr=ansptr.next;
                    }
                    start.flag=1;
                    s.flag=1;
                    break;
                }
                s=s.next;
            }
            if(s==null)
            {
                ansnode.power=start.power;
                ansnode.coeff=start.coeff;
                ansnode.next=null;
                if(ans==null)
                {
                    ans=ansnode;
                    ansptr=ans;
                }
                else{
                    ansptr.next=ansnode;
                    ansptr=ansptr.next;
                }
                start.flag=1;
            }
            }
            start=start.next;
        }
        ptr=ans;
        while(ptr!=null)
        {
            System.out.print(ptr.coeff+"x^"+ptr.power+" ");
            ptr=ptr.next;
        }
        
        // Write your code here
    }
}