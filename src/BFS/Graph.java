package BFS;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {


    // global class scobe variabkes
    // V vertices anf graph g

    private int V;
    private LinkedList<Integer>adj[];

    Graph(int v)
    {
        V=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++)
            adj[i]=new LinkedList<>();
    }

    void addEdge(int v,int w)
    {
        adj[v].add(w);  //directed
        //adj[w].add(v);
    }

    void BFS(int s)
    {

        boolean visited[]=new boolean[V];
        LinkedList<Integer>queue=new LinkedList<Integer>();

        visited[s]=true;
        queue.add(s);


        while(queue.size()!=0)
        {



            s=queue.poll();

            System.out.println(s+" ");

           // Iterator<Integer> i=adj[s].listIterator();

            for(Integer x:adj[s])
            {
               if(!visited[x]) {
                   queue.add(x);
                   visited[x] = true;
               }
            }
        }
    }

    public  static  void main(String args[])
    {

        Graph g=new Graph(4);

        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);

        g.BFS(0);


    }

}
