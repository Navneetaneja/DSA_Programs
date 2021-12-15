import java.util.*;

/* import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Solution.placeNQueens(n);	
	}

} */


public class Solution {
    
    static boolean isSafe(int mat[][],int r,int c,int n)
    {
        for(int i=0;i<c;i++)
        {
            if(mat[r][i]==1)
                return false;
        }
        for(int i=r-1,j=c-1;i>=0 && j>=0 ;i--,j--)
        {
            if(mat[i][j]==1)
                return false;
        }
        for(int i=r+1,j=c-1;i<n && j>=0 ; i++,j--)
        {
            if(mat[i][j]==1)
                return false;
        }
        return true;
    }

    static void print(int mat[][])
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
        }
        System.out.println();
    }
    static void helper(int mat[][],int index,int q,int n)
    {
        mat[index][q]=1;
        
        if(q==n-1)
        {
            print(mat);
            mat[index][q]=0;
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(isSafe(mat,i,q+1,n))
            {
                helper(mat,i,q+1,n);
            }
        }
        
        mat[index][q]=0;
        
        return;
    }
    
    public static void placeNQueens(int n){
        
        int mat[][]=new int[n][n];
        
        for(int i=0;i<n;i++)
        {
            helper(mat,i,0,n);
        }
    }

}
