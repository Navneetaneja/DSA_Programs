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

    static void dijkstra(int adjmat[][])
    {
        int v=adjmat.length;
        boolean visited[]=new boolean[v];
        int weight[]=new int[v];
        // int parent[]=new int[v];

        // parent[0]=-1;
        weight[0]=0;

        for(int i=1;i<v;i++)
        {
            weight[i]=Integer.MAX_VALUE;
        }

        int t=findmin(weight,visited);

        while(t!=-1)
        {
            visited[t]=true;
            for(int j=0;j<v;j++)
            {
                if(adjmat[t][j]!=0 && visited[j]==false)
                {
                    if(weight[t]+adjmat[t][j]<weight[j])
                    {
                        weight[j]=adjmat[t][j]+weight[t];
                        // parent[j]=t;
                    }
                }
            }
            t=findmin(weight,visited);
        }

        // for(int i=1;i<v;i++)
        // {
        //    int k=i;
        //    while(parent[k]!=0)
        //    {
        //        weight[i]+=weight[parent[k]];
        //        parent[k]=parent[parent[k]];
        //    }
        // }
        for(int i=0;i<v;i++)
        {
            System.out.println(i+" "+weight[i]);
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        int e = s.nextInt();

        int adjmat[][]=new int[v][v];

        for(int i=0;i<e;i++)
        {
            int src=s.nextInt();
            int d=s.nextInt();
            int w=s.nextInt();
            adjmat[src][d]=w;
            adjmat[d][src]=w;
        }
        dijkstra(adjmat);

    }
}