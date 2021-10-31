import java.util.*;
class Node{
   int data;
   Node left;
   Node right;
   Node(int data)
   {
       this.data=data;
       this.left=null;
       this.right=null;
   }
}
public class Main
{
    static Node start;
    static void buildTree(ArrayList<Node> arr)
    {
        if(arr.size()==1)
        return;
        Collections.sort(arr,new Comparator<Node>(){
            @Override
            public int compare(Node a,Node b)
            {
                if(a.data < b.data)
                return -1;
                else if(a.data > b.data)
                return 1;
                else
                return 0;
            }
        });
        int s=arr.get(0).data+arr.get(1).data;
		Node root=new Node(s);
		root.left=arr.get(0);
		root.right=arr.get(1);
		start=root;
		System.out.println(root.data+" "+arr.get(0).data+" "+arr.get(1).data+" "+start.data);
        arr.remove(0);
		arr.remove(0);
		arr.add(root);
		buildTree(arr);
    }
    static void printNodes(Node root)
    {
        if(root==null)
        return;
        System.out.println(root.data+" ");
        printNodes(root.left);
        printNodes(root.right);
    }
	public static void main(String[] args) {
		ArrayList<Node> arr=new ArrayList<>();
		arr.add(new Node(5));
		arr.add(new Node(9));
		arr.add(new Node(12));
		arr.add(new Node(13));
		arr.add(new Node(16));
		arr.add(new Node(45));
		
		int s=arr.get(0).data+arr.get(1).data;
		Node root=new Node(s);
		root.left=arr.get(0);
		root.right=arr.get(1);
		start=root;
		System.out.println(root.data+" "+arr.get(0).data+" "+arr.get(1).data+" "+start.data);
		arr.remove(0);
		arr.remove(0);
		arr.add(root);
		buildTree(arr);
		System.out.println();
		printNodes(start);
	}
}
