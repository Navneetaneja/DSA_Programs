import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
       this.data=data; 
    }
}
public class Main
{
    static int index=0;
    static Node buildTree(int in[],int pre[],int st,int end)
    {
        if(st>end)
        return null;
        Node temp=new Node(pre[index++]);
        int i;
        for(i=0;i<in.length;i++)
        {
            if(in[i]==temp.data)
            {
                break;
            }
        }
        //i=5;
        temp.left=buildTree(in,pre,st,i-1);
        temp.right=buildTree(in,pre,i+1,end);
        return temp;
    }
    static void print(Node root)
    {
        if(root==null)
        return;
        System.out.print(root.data+" ");
        print(root.left);
        print(root.right);
    }
	public static void main(String[] args) {
		int in[]=new int[]{7,9,4,2,5,1,3,6,8};
		int pre[]=new int[]{1,2,4,7,9,5,3,6,8};
		Node root=buildTree(in,pre,0,in.length-1);
		print(root);
	}
}
