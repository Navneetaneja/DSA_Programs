import java.util.*;

public class Main
{
    static int helper(int mat[][],int dp[][],int x,int y,int n)
    {
        if(x>=n || y>=n || x<0 || y<0)
        {
            return 0;
        }
        
        if(dp[x][y]==1)
        return 1;
        
        if(dp[x][y]==0)
        return 0;
        
        if(mat[x][y]==0)
        {
            return 0;
        }
        
        if(mat[x][y]==1 && (x==0 || y==0 || x==n-1 || y==n-1))
        {
            return 1;
        }
        
        if(mat[x][y]==1)
        {
        
        mat[x][y]=0;
        
        int op1=helper(mat,dp,x,y+1,n);
        int op2=helper(mat,dp,x,y-1,n);
        int op3=helper(mat,dp,x+1,y,n);
        int op4=helper(mat,dp,x-1,y,n);
        
        mat[x][y]=1;
        
        if(op1==0 && op2==0 && op3==0 && op4==0)
        {
            return 0;
        }
        }
        return 1;        
        
    }
    
    static void help(int mat[][],int dp[][],int x,int y,int n)
    {
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                dp[i][j]=helper(mat,dp,i,j,n);
                if(dp[i][j]==0)
                mat[i][j]=0;
            }
        }
    }
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int mat[][]=new int[][]{{1,0,0,0,0,0},{0,1,0,1,1,1},{0,0,1,0,1,0},{1,1,0,0,1,0},{1,0,1,1,0,0},{1,0,0,0,0,1}};
	    
	    int dp[][]=new int[6][6];
	    for(int i=0;i<6;i++)
	    {
	        for(int j=0;j<6;j++)
	        {
	            dp[i][j]=-1;
	        }
	    }
	    for(int i=0;i<6;i++)
	    {
	        for(int j=0;j<6;j++)
	        {
	           System.out.print(mat[i][j]+" ");
	        }
	        System.out.println();
	    }
	    System.out.println();
	    
	    help(mat,dp,0,0,6);
	    
	    
	    
	    
	    for(int i=0;i<6;i++)
	    {
	        for(int j=0;j<6;j++)
	        {
	           System.out.print(mat[i][j]+" ");
	        }
	        System.out.println();
	    }
	}
}
