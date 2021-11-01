import java.util.*;

class Node{
    String data;
    ArrayList<Node> arr;
    ArrayList<Integer> weight;
    int flag=0;
    Node(String data)
    {
        this.data=data;
        arr=new ArrayList<>();
        weight=new ArrayList<>();
    }
}

public class Main
{
    static Node findmin(Node start)
    {
        Node min=null;
        int mn=Integer.MAX_VALUE;;
        for(int i=0;i<start.arr.size();i++)
        {
            if(start.arr.get(i).flag==0)
            {
                if(start.weight.get(i) < mn)
                {
                    mn=start.weight.get(i);
                    min=start.arr.get(i);
                }
            }
        }
        return min;
    }
	public static void main(String[] args) {
	    ArrayList<Node> list=new ArrayList<>();
		Node H1=new Node("H1");
		Node H2=new Node("H2");
		Node H3=new Node("H3");
		Node H4=new Node("H4");
		Node H5=new Node("H5");
		Node H6=new Node("H6");
		Node H7=new Node("H7");
		Node H8=new Node("H8");
		
		H1.arr.add(H2);
		H1.arr.add(H4);
		H1.arr.add(H6);
		H1.arr.add(H8);
		
		H2.arr.add(H1);
		H2.arr.add(H3);
		H2.arr.add(H4);
		H2.arr.add(H5);
		
		H3.arr.add(H2);
		H3.arr.add(H4);
		
		H4.arr.add(H1);
		H4.arr.add(H2);
		H4.arr.add(H3);
		H4.arr.add(H5);
		
		H5.arr.add(H2);
		H5.arr.add(H4);
		H5.arr.add(H6);
		H5.arr.add(H7);
		
		H6.arr.add(H1);
		H6.arr.add(H5);
		H6.arr.add(H7);
		
		H7.arr.add(H5);
		H7.arr.add(H6);
		H7.arr.add(H8);
		
		H8.arr.add(H1);
		H8.arr.add(H7);
		
		H1.weight.add(5);
		H1.weight.add(6);
		H1.weight.add(6);
		H1.weight.add(4);
		
		H2.weight.add(5);
		H2.weight.add(2);
		H2.weight.add(4);
		H2.weight.add(3);
		
		H3.weight.add(2);
		H3.weight.add(1);
		
		H4.weight.add(6);
		H4.weight.add(4);
		H4.weight.add(1);
		H4.weight.add(7);
		
		H5.weight.add(3);
		H5.weight.add(7);
		H5.weight.add(4);
		H5.weight.add(6);
		
		H6.weight.add(6);
		H6.weight.add(4);
		H6.weight.add(2);
		
		H7.weight.add(6);
		H7.weight.add(2);
		H7.weight.add(3);
		
		H8.weight.add(4);
		H8.weight.add(3);
		
		Node start=H1;
		
		while(start!=null)
		{
		    start.flag=1;
		    list.add(start);
		    start=findmin(start);
		}
		
		for(int i=0;i<list.size();i++)
		{
		    System.out.print(list.get(i).data+" -> ");
		}
		
	}
}
