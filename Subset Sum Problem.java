/* To find all possible subsets of an element in array */
import java.util.*;

public class Main
{
    static void findSub(int arr[],int index,int start,int sum,int n)
    {
        if(sum==n)
        {
            if(start!=index)
            System.out.println(arr[start]+" "+arr[index-1]);
            else
            System.out.println(arr[start]+" "+0);
            return;
        }
        if(sum>n || index>=arr.length)
        return;
        findSub(arr,index+1,start,sum+arr[index],n);
        findSub(arr,index+1,start,sum,n);
    }
	public static void main(String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
		int arr[]=new int[]{3,4,5,6,9};
		int sum=0;
		int n=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
		    findSub(arr,i,i,sum+arr[i],n);
		}
	}
}
