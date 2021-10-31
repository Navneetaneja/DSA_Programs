/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
}
public class Main
{
    static Scanner sc=new Scanner(System.in);
    static Node root=null;
    static void insert()
    {
        System.out.println("enter element");
        int e=sc.nextInt();
        Node s=new Node();
        s.data=e;
        s.left=null;
        s.right=null;
        if(root==null)
        root=s;
        else{
            Node ptr=root;
            int flag=0;
            while(flag!=1)
            {
            if(s.data==ptr.data)
            {
                return;
            }
            else if(s.data<ptr.data && ptr.left!=null)
            {
                ptr=ptr.left;
            }
            else if(s.data>ptr.data && ptr.right!=null)
            {
                ptr=ptr.right;
            }
            else if(s.data<ptr.data)
            {
                ptr.left=s;
                flag=1;
            }
            else if(s.data>ptr.data)
            {
                ptr.right=s;
                flag=1;
            }
            }
        }
    }
    static void search()
    {
        System.out.println("enter element to search");
        int e=sc.nextInt();
        Node ptr=root;
        int flag=0;
        while(ptr!=null)
        {
            if(ptr.data==e)
            {
                flag=1;
                break;
            }
            else if(e<ptr.data)
            {
                ptr=ptr.left;
            }
            else if(e>ptr.data)
            {
                ptr=ptr.right;
            }
        }
        if(flag==1)
        System.out.println("Found");
        else
        System.out.println("Not Found");
    }
     public static void delete()
    {
        System.out.println("Enter Deletening Element");
        int deleteElement=sc.nextInt();
        Node ptr;
        Node prev=null;
        ptr=root;
        int flag=0;
        
        while(ptr!=null)
        {
            if(deleteElement==ptr.data)
             {
                
                flag=1;
             
                if(ptr.left==null&&ptr.right==null)
                {
                if(prev.left.data==deleteElement)
                  prev.left=null;
                else
                  prev.right=null;
                  
                break;  
             }
                else if(ptr.left!=null&&ptr.right==null)
                {
                    prev.right=ptr.left;
                    break;
                }
                else if(ptr.right!=null&&ptr.left==null)
                {
                    prev.left=ptr.right;
                    break;
                }
                else if(ptr.left!=null&&ptr.right!=null)
                {
                   Node one ;
                   one= ptr.right;
                   Node two;
                   two=ptr;
                  Node preone;
                  preone=ptr;
                  int min1=min;
                   while(one.left!=null)
                   {
                       if(min1>one.data)
                         { two=one;
                             min1=one.data;
                         }
                         preone=one;
                        one=one.left;  
                   }
                   if(min1>=one.data)
                         { two=one;
                             min1=one.data;
                         }
                   
                   ptr.data=min1;
                   
                   if(ptr.right.left==null)
                   ptr.right=one.right;
                   else
                   preone.left=two.right;
                   
                   break;
                }
             
             
             
             
             
                 
             }
            if(deleteElement<ptr.data)
            {
                prev=ptr;
                ptr=ptr.left;
            }
            else
            {
                prev=ptr;
                ptr=ptr.right;
            }
        }
        
        if(flag==0)
         System.out.println("Not Found");
    }
    static void printNodes(Node root)
    {
        if(root==null)
        return;
        System.out.println(root.data);
        printNodes(root.left);
        printNodes(root.right);
    }
	public static void main(String[] args) {
	    
		int n;
		
		do{
		    System.out.println("1.Insert element");
		    System.out.println("2.Search element");
		    System.out.println("3.Delete element");
		    System.out.println("0.exit");
		    n=sc.nextInt();
		    switch(n)
		    {
		        case 1:
		            insert();
		            break;
		        case 2:
		            search();
		            break;
		        case 3:
		            delete();
		            break;
		        default:
		            System.out.println("Invalid Input");
		            break;
		        case 0:
		            break;
		            
		    }
		    
		  }while(n!=0);
		  
		  printNodes(root);
		  
	}
}
