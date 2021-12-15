import java.util.*;

class Edge implements Comparable<Edge>{

    int source;
    int dest;
    int weight;

    public void print()
    {
        System.out.println(Math.min(source,dest)+" "+Math.max(source,dest)+" "+weight);
    }
    public int compareTo(Edge e)
    {
        return this.weight-e.weight;
    }
}

public class Solution {
    
    static int findParent(int v,int[] parent)
    {
        if(parent[v]==v)
            return v;
        return findParent(parent[v],parent);
    }

    static void kruskals(Edge[] input,int v,int e)
    {
        Arrays.sort(input);
        Edge[] output=new Edge[v-1];
        
        int parent[]=new int[v];
        for(int i=0;i<v;i++)
        {
            parent[i]=i;
        }
        int ct=0,i=0;
        while(ct!=v-1)
        {
            Edge cur=input[i];
            int sourceparent=findParent(cur.source,parent);
            int destparent=findParent(cur.dest,parent);
            
            if(sourceparent!=destparent)
            {
                output[ct]=cur;
                ct++;
                parent[sourceparent]=destparent;
            }
            i++;
        }
        for(int j=0;j<v-1;j++)
        {
            output[j].print();
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();

        Edge input[]=new Edge[E];
        for(int i=0;i<E;i++)
        {
            input[i]=new Edge();
            input[i].source=sc.nextInt();
            input[i].dest=sc.nextInt();
            input[i].weight=sc.nextInt();
        }
        kruskals(input,V,E);
    }
}