import java.util.*;
class Node{
    char data;
    Node left;
    Node right;
    Node(char data)
    {
       this.data=data; 
    }
}
public class Main
{
    static int index=0;
    static Node buildTree(char in[],char post[],int st,int end)
    {
        if(st>end)
        return null;
        if(index>=post.length)
        return null;
        Node temp=new Node(post[post.length-index-1]);
        index++;
        int i;
        for(i=0;i<in.length;i++)
        {
            if(in[i]==temp.data)
            {
                break;
            }
        }
        temp.right=buildTree(in,post,i+1,end);
        temp.left=buildTree(in,post,st,i-1);
        return temp;
    }
    static void print(Node root)
    {
        if(root==null)
        return;
        print(root.left);
        System.out.print(root.data+" ");
        print(root.right);
    }
	public static void main(String[] args) {
		char in[]=new char[]{'A','B','C','D','E','F','G','H','I'};
		char post[]=new char[]{'A','C','E','D','B','H','I','G','F'};
		Node root=buildTree(in,post,0,in.length-1);
		print(root);
	}
}
