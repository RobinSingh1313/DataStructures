package Graphs.Creating;

import java.util.LinkedList;
import java.util.Scanner;

public class practieGraph {
    LinkedList<Integer> adj[];



    public  practieGraph(int v)
    {
        adj=new LinkedList[v];// new linked list created
        for (int i=0;i<v;i++)
        {
            adj[i]=new LinkedList<>();

        }
    }
    public  void addEdge(int source,int destination)
    {
        adj[source].add(destination);
        adj[destination].add(source);


    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Vertices & Edges:");
        int vertices=sc.nextInt();
        int edges=sc.nextInt();
        practieGraph practieGraphs=new practieGraph(vertices);


        System.out.println("Enter Edges : "+edges);
        for (int i=0;i<edges;i++)
        {
            int source= sc.nextInt();
            int destination=sc.nextInt();
            practieGraphs.addEdge(source,destination);


        }


    }
}
