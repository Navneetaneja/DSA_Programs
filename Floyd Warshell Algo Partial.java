import java.util.*;
class Node{
    int data;
    ArrayList<Node> arr;
    ArrayList<Integer> weight;
    Node(int data)
    {
        this.data=data;
        arr=new ArrayList<>();
        weight=new ArrayList<>();
    }
}
public class Main
{
    static ArrayList<Node> list;
	public static void main(String[] args) {
	    list=new ArrayList<>();
		Node A=new Node(1);
		Node B=new Node(2);
		Node C=new Node(3);
		Node D=new Node(4);
		
		list.add(A);
		list.add(B);
		list.add(C);
		list.add(D);
		
		A.arr.add(B);
		B.arr.add(C);
		B.arr.add(D);
		C.arr.add(A);
		C.arr.add(D);
		D.arr.add(A);
		D.arr.add(B);
		
		A.weight.add(3);
		B.weight.add(12);
		B.weight.add(5);
		C.weight.add(4);
		C.weight.add(-1);
		D.weight.add(2);
		D.weight.add(-4);
		
		int matrix1[][]=new int[list.size()][list.size()];
		
		for(int i=0;i<list.size();i++)
		{
		    Node t=list.get(i);
		    for(int j=0;j<list.size();j++)
		    {
		        if(i==j)
		        matrix1[i][j]=0;
		        else
		        {
		            Node temp=list.get(j);
		            int pos=t.arr.indexOf(temp);
		            if(pos!=-1)
		            {
		                matrix1[i][j]=t.weight.get(pos);
		            }
		            else{
		                matrix1[i][j]=Integer.MAX_VALUE;
		            }
		        }
		    }
		}
		
		int matrix2[][]=new int[list.size()][list.size()];
		
		int k=1;
// 		while(k<=list.size());
// 		{
		    for(int i=0;i<list.size();i++)
		    {
		        for(int j=0;j<list.size();j++)
		        {
		            if(i==j)
		            matrix2[i][j]=0;
		            else{
		                if(matrix1[i][k-1]==Integer.MAX_VALUE || matrix1[k-1][j]==Integer.MAX_VALUE)
		                {
		                    matrix2[i][j]=matrix1[i][j];
		                }
		                else
		                matrix2[i][j]=Math.min(matrix1[i][j],(matrix1[i][k-1]+matrix1[k-1][j]));
		            }
		        }
		    }
		    
		    
		    
// 		    k++;
// 		}
		
		
		
		
		
		for(int i=0;i<matrix1.length;i++)
		{
		    for(int j=0;j<matrix1[i].length;j++)
		    {
		        System.out.print(matrix1[i][j]+" ");
		    }
		    System.out.println();
		}
		System.out.println();
		for(int i=0;i<matrix2.length;i++)
		{
		    for(int j=0;j<matrix2[i].length;j++)
		    {
		        System.out.print(matrix2[i][j]+" ");
		    }
		    System.out.println();
		}
		
		
	}
}
