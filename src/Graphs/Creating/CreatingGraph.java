package Graphs.Creating;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CreatingGraph {

   static LinkedList<Integer> adj[];
    public CreatingGraph(int v)
    {
        adj=new LinkedList[v];
        for (int i=0;i<v;i++)
        {adj[i]=new LinkedList<Integer>();

        }
    }

    public  void  addEdge(int source,int destination)
    {
        adj[source].add(destination);
        adj[destination].add(source);

    }
public int bfs(int source,int destination)
{
    boolean vis[]=new boolean[adj.length];
    int parent[]=new int[adj.length];

    Queue<Integer>q =new LinkedList<>();
    q.add(source);
    parent[source]=-1;
    vis[source]=true;
    while (!q.isEmpty())
    {
        int cur=q.poll();
        if(cur==destination)break;
        for (int neighbour:adj[cur])
        {
            if (!vis[neighbour])
            {
                vis[neighbour]= true;

                q.add(neighbour);
                parent[neighbour]=cur;


            }
        }


    }
   int cur=destination;
    int distance=0;


    while (parent[cur]!=-1)
    {
        System.out.print(cur+"-->");
        cur=parent[cur];
        distance++;



    }


    return destination;


}

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter vertice s & edges");
        int v=scanner.nextInt();
        int e=scanner.nextInt();
        CreatingGraph creatingGraph=new CreatingGraph(v);
        System.out.println("Enter"+e+"Edges");
        for (int i=0;i<e;i++)
        {
            int source= scanner.nextInt();
            int dest=scanner.nextInt();
            creatingGraph.addEdge(source,dest);

        }
        System.out.println("Enter source destination");
        int so=scanner.nextInt();
        int de=scanner.nextInt();
        creatingGraph.bfs(so,de);


    }

}
