/*To find a loop in graph without going to other nodes twice or more..*/

import java.util.*;

class Node{
    char data;
    ArrayList<Node> arr;
    ArrayList<Node> tree;
    
    Node(char data)
    {
        this.data=data;
        arr=new ArrayList<>();
        tree=new ArrayList<>();
    }
}

public class Main
{
    static ArrayList<Node> list;
    static int flag=0;
    static void findPath(Node root)
    {
        for(int i=0;i<root.arr.size();i++)
        {
            if(list.indexOf(root.arr.get(i))==-1)
            {
                root.tree.add(root.arr.get(i));
            }
        }
        list.add(root);
        if(root.tree.size()==0 && root.arr.indexOf(list.get(0))!=-1)
        {
            flag=1;
            return;
        }
        else if(root.tree.size()==0 && root.arr.indexOf(list.get(0))==-1)
        {
            list.remove(list.size()-1);
            return;
        }
        // System.out.println(root.data);
        // for(int i=0;i<root.tree.size();i++)
        // {
        //     System.out.print(root.tree.get(i).data);
        // }
        // System.out.println();
        for(int i=0;i<root.tree.size();i++)
        {
            findPath(root.tree.get(i));
            if(flag==1)
            return;
        }
        root.tree.clear();
        list.remove(list.size()-1);
    }
	public static void main(String[] args) {
	    list=new ArrayList<>();
		Node A=new Node('a');
		Node B=new Node('b');
		Node C=new Node('c');
		Node D=new Node('d');
		Node E=new Node('e');
		Node F=new Node('f');
		
		A.arr.add(B);
		A.arr.add(C);
		A.arr.add(D);
		
		B.arr.add(A);
		B.arr.add(C);
		B.arr.add(E);
		
		C.arr.add(A);
		C.arr.add(B);
		C.arr.add(D);
		C.arr.add(E);
		
		D.arr.add(A);
		D.arr.add(C);
		D.arr.add(E);
		D.arr.add(F);
		
		E.arr.add(B);
		E.arr.add(C);
		E.arr.add(D);
		E.arr.add(F);
		
		F.arr.add(D);
		F.arr.add(E);
		
		Node root=A;
		findPath(root);
		for(int i=0;i<list.size();i++)
		{
		    System.out.print(list.get(i).data+" ");
		}
	}
}
