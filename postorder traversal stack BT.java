import java.util.*;
class Tree{
    int data;
    Tree left;
    Tree right;
    Tree(int data)
    {
        this.data=data;
    }
}
public class Main
{
	public static void main(String[] args) {
		Tree A=new Tree(1);
		Tree B=new Tree(2);
		Tree C=new Tree(3);
		Tree D=new Tree(4);
		Tree E=new Tree(5);
		Tree F=new Tree(6);
		Tree G=new Tree(7);
		Tree H=new Tree(8);
		Tree I=new Tree(9);
		Tree J=new Tree(10);
		A.left=B;A.right=C;
		B.left=D;B.right=E;
		C.left=null;C.right=F;
		D.left=null;D.right=null;
		E.left=G;E.right=H;
		G.left=H.left=G.right=H.left=null;
		F.left=I;F.right=J;
		I.left=I.right=J.left=J.right=null;
		
		Stack<Tree> s=new Stack<>();
		s.push(null);
		Tree root=A;
		Tree ptr=root;
		while(ptr!=null)
		{
		while(ptr!=null)
		{
		    s.push(ptr);
		    if(ptr.right!=null)
		    {
		    ptr.right.data=-ptr.right.data;
		    s.push(ptr.right);
		    }
		    ptr=ptr.left;
		}
		ptr=s.pop();
		while(ptr!=null && ptr.data>=0)
		{
		    System.out.print(ptr.data+" ");
		    ptr=s.pop();
		}
		if(ptr!=null && ptr.data<0)
		{
		    ptr.data=-ptr.data;
		}
		}
	}
}
