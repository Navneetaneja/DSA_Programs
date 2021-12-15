/*
	Note:
	To get all the test cases accepted, make recursive calls in following order: Top, Down, Left, Right.
	This means that if the current cell is (x, y), then order of calls should be: top cell (x-1, y), 
	down cell (x+1, y), left cell (x, y-1) and right cell (x, y+1).
*/  

import java.io.*;
import java.util.*;

/* public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[][] maze = new int[20][20];
        for (int i = 0; i < n; i++)
        {
            StringTokenizer tk = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < n; j++)
            {
                maze[i][j] = Integer.parseInt(tk.nextToken());
            }
        }
        Solution.ratInAMaze(maze, n);
    }
} */


public class Solution {

    static void help(int maze[][],int i,int j,int n)
    {
        if(i==n-1 && j==n-1)
        {
            maze[i][j]=2;
            for(int r=0;r<n;r++)
            {
                for(int c=0;c<n;c++)
                {
                    if(maze[r][c]==2)
                    {
                        System.out.print(1+" ");
                    }
                    else if(maze[r][c]==1 || maze[r][c]==0)
                    {
                        System.out.print(0+" ");
                    }
                }
            }
            System.out.println();
            maze[i][j]=1;
            return;
        }
        if(i<0 || j<0 || i>=n || j>=n)
            return;
        if(maze[i][j]==0 || maze[i][j]==2)
            return;

        maze[i][j]=2;

        help(maze,i-1,j,n);
        help(maze,i+1,j,n);
        help(maze,i,j-1,n);
        help(maze,i,j+1,n);

        maze[i][j]=1;

        return;

    }

    static void ratInAMaze(int maze[][], int n) {

        help(maze,0,0,n);

    }

}