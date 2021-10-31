import java.util.*;
class Node{
    char data;
    Node left;
    Node right;
    Node(char data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class Main
{
    static ArrayList<Node> arr;
    static void findNode(Node root,char node,ArrayList<Node> temp)
    {
        if(root==null)
        return;
        temp.add(root);
        if(root.data==node)
        {
            arr=new ArrayList(temp);
            return;
        }
        findNode(root.left,node,temp);
        findNode(root.right,node,temp);
        temp.remove(temp.size()-1);
    }
    static void kDown(Node root,Node block,int k)
    {
        if(k<0 || root==null || root==block)
        {
            return;
        }
        if(k==0)
        {
            System.out.println(root.data);
            return;
        }
        kDown(root.left,block,k-1);
        kDown(root.right,block,k-1);
        
    }
	public static void main(String[] args) {
	    Node K=new Node('K');
	    Node F=new Node('F');
	    Node B=new Node('B');
	    Node D=new Node('D');
	    Node C=new Node('C');
	    Node G=new Node('G');
	    Node E=new Node('E');
	    Node H=new Node('H');
	    Node I=new Node('I');
	    Node J=new Node('J');
	    Node M=new Node('M');
	    
	    K.left=F;F.left=B;F.right=C;
	    B.left=D;B.right=E;
	    D.left=M;E.left=G;E.right=H;
	    C.right=I;I.left=J;
	    
	    Node root=K;
	    int k=2;
	    arr=new ArrayList<>();
	    findNode(root,'B',new ArrayList<>());
	    for(int i=arr.size()-1;i>=0 && k>=0;i--)
	    {
	        Node block;
	        if(i==arr.size()-1)
	        block=null;
	        else
	        block=arr.get(i+1);
	        kDown(arr.get(i),block,k);
	        k--;
	    }
	   // for(int i=0;i<arr.size();i++)
	   // {
	   //     System.out.println(arr.get(i).data);
	   // }
	    
	}
}
