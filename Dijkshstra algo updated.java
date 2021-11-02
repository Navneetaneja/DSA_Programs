/* single source shortest path . To find min distance from one node to all nodes*/
import java.util.*;
class Node
{
    char data;
    ArrayList<Node> arr;
    ArrayList<Integer> weight;
    int flag=0;
    int sum=Integer.MAX_VALUE;
    Node(char data)
    {
        this.data=data;
        arr=new ArrayList<>();
        weight=new ArrayList<>();
    }
}

public class Main
{
    static ArrayList<Node> list1;
	
    static Node findmin()
    {
        Node min=null;
        for(int i=0;i<list1.size();i++)
        {
            if(list1.get(i).flag==0)
            {
                if(min==null)
                {
                    min=list1.get(i);
                }
                else if(list1.get(i).sum < min.sum)
                {
                    min=list1.get(i);
                }
            }
        }
        return min;
    }
    
	public static void main(String[] args) {
	    list1=new ArrayList<>();
		Node A=new Node('A');
		Node B=new Node('B');
		Node C=new Node('C');
		Node D=new Node('D');
		Node E=new Node('E');
		list1.add(A);
		list1.add(B);
		list1.add(C);
		list1.add(D);
		list1.add(E);
		
		A.arr.add(B);
		A.arr.add(C);
		B.arr.add(C);
		B.arr.add(D);
		C.arr.add(E);
		D.arr.add(E);
		E.arr.add(D);
		E.arr.add(A);
		
		A.weight.add(6);
		A.weight.add(5);
		B.weight.add(2);
		B.weight.add(1);
		C.weight.add(2);
		D.weight.add(4);
		E.weight.add(6);
		E.weight.add(7);
		
		Node start=A;
		start.sum=0;
		while(start!=null && start.flag==0)
		{
		    start.flag=1;
		    for(int i=0;i<start.arr.size();i++)
		    {
		        if(start.arr.get(i).sum > (start.sum+start.weight.get(i)))
		        start.arr.get(i).sum=start.sum+start.weight.get(i);
		    }
		  //  int m=Collections.min(start.weight);
		  //  int pos=start.weight.indexOf(m);
		  //  Node temp=start.arr.get(pos);
		  //  temp.sum=Math.min(temp.sum,start.sum+m);
		    start=findmin();
		 }
		 for(int i=0;i<list1.size();i++)
		 {
		     System.out.println(list1.get(i).sum);
		 }
		 
	}
}
