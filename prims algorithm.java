import java.util.*;

public class Solution {

    static int findmin(int weight[],boolean visited[])
    {
        int min=Integer.MAX_VALUE;
        int n=-1;
        for(int i=0;i<weight.length;i++)
        {
            if(weight[i]<min && visited[i]==false)
            {
                min=weight[i];
                n=i;
            }
        }
        return n;
    }
    static void prims(int adjmat[][])
    {
        int v=adjmat.length;
        boolean visited[]=new boolean[v];
        int weight[]=new int[v];
        int parent[]=new int[v];

        weight[0]=0;
        parent[0]=-1;

        for(int i=1;i<v;i++)
        {
            weight[i]=Integer.MAX_VALUE;
        }

        int t=findmin(weight,visited);

        while(t!=-1)
        {
            visited[t]=true;
            for(int i=0;i<v;i++)
            {
                if(adjmat[t][i]!=0 && visited[i]==false)
                {
                    if(adjmat[t][i]<weight[i])
                    {
                        weight[i]=adjmat[t][i];
                        parent[i]=t;
                    }
                }
            }
            t=findmin(weight,visited);
        }
        for(int i=1;i<v;i++)
        {
            System.out.println(Math.min(i,parent[i])+" "+
                               Math.max(i,parent[i])+" "+weight[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();

        int adjmat[][]=new int[v][v];

        for(int i=0;i<e;i++)
        {
            int s=sc.nextInt();
            int d=sc.nextInt();
            int we=sc.nextInt();

            adjmat[s][d]=we;
            adjmat[d][s]=we;

        }

        prims(adjmat);


    }
}