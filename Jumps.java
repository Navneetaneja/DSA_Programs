import java.util.*;
public class Jumps
{
    static int helper(int arr[],int index,int n,int jumps)
    {
        if(index==n)
        {
        return jumps;
        }
        if(index>n)
        {
            return Integer.MAX_VALUE;
        }
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=arr[index];i++)
        {
            int ans=helper(arr,index+i,n,jumps+1);
            min=Math.min(min,ans);
        }
        return min;
    }
    
	public static void main(String[] args) {
	    int n=5;
	    int arr[]=new int[]{2,1,3,2,4};
	    int x=helper(arr,0,n-1,0);
                   if(x==Integer.MAX_VALUE)
                   {
                        System.out.println(-1);
                   }
                   else
                   System.out.println(x);
	}
}
