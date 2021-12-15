import java.util.*;

/* import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int maze[][] = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				maze[i][j] = s.nextInt();
			}
		}
		System.out.println(Solution.ratInAMaze(maze));	
	}

} */


public class Solution {

    static boolean help(int maze[][],int i,int j,int n)
    {
        if(i==n-1 && j==n-1)
            return true;
        if(i<0 || j<0 || i>=n || j>=n)
            return false;
        if(maze[i][j]==0)
            return false;
        maze[i][j]=0;
        boolean op1=help(maze,i-1,j,n);
        boolean op2=help(maze,i+1,j,n);
        boolean op3=help(maze,i,j-1,n);
        boolean op4=help(maze,i,j+1,n);
        
        if(op1 || op2 || op3 || op4)
            return true;
        maze[i][j]=1;
        return false;
        
    }
	public static boolean ratInAMaze(int maze[][]){
        
        return help(maze,0,0,maze.length);
	}
}
