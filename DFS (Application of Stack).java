import java.util.*;

class Node{
    char data;
    ArrayList<Node> arr;
    int flag=0;
    Node(char data)
    {
        this.data=data;
        arr=new ArrayList<>();
    }
}

public class Main
{
	public static void main(String[] args) {
		Node A=new Node('A');
		Node B=new Node('B');
		Node C=new Node('C');
		Node D=new Node('D');
		Node E=new Node('E');
		Node F=new Node('F');
		Node G=new Node('G');
		Node H=new Node('H');
		Node I=new Node('I');
		
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
		C.arr.add(F);
		C.arr.add(G);
		D.arr.add(A);
		D.arr.add(C);
		D.arr.add(G);
		E.arr.add(B);
		E.arr.add(C);
		E.arr.add(F);
		E.arr.add(H);
		F.arr.add(C);
		F.arr.add(E);
		F.arr.add(G);
		F.arr.add(H);
		F.arr.add(I);
		G.arr.add(C);
		G.arr.add(D);
		G.arr.add(F);
		G.arr.add(I);
		H.arr.add(E);
		H.arr.add(F);
		I.arr.add(F);
		I.arr.add(G);
		
		Stack<Node> st=new Stack<>();
		
		st.push(A);
		while(!st.empty())
		{
		    Node temp=st.pop();
		    temp.flag=1;
		    for(int i=0;i<temp.arr.size();i++)
		    {
		        Node t=temp.arr.get(i);
		        if(t.flag==0)
		        {
		            st.push(t);
		            t.flag=1;
		        }
		    }
		    System.out.print(temp.data+" ");
		}
		
		
	}
}
