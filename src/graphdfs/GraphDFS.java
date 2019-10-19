
package graphdfs;
import java.util.ArrayList; 
import java.util.LinkedList; 
import java.util.List; 
  
public class GraphDFS { 
      
    static class Graph{
        int vertices;
        LinkedList<Integer> [] adjList;

        public Graph(int vertices) {
            this.vertices = vertices;
            adjList = new LinkedList[vertices];
            for (int i = 0; i <vertices ; i++) {
                adjList[i] = new LinkedList<>();
            }
        }
        public void addEdge(int source, int destination)
        {
            adjList[source].addFirst(destination);
            adjList[destination].addFirst(source);
        }

        public boolean isCycle() {
            boolean result = false;
            boolean[] visited = new boolean[vertices];
            for (int i = 0; i <vertices ; i++) {
                if(visited[i]==false){
                    if(isCycleUtil(i, visited, -1)){
                        return true;
                    }
                }
            }
            return result;
        }

        boolean isCycleUtil(int currVertex, boolean [] visited, int parent)
        {
            visited[currVertex] = true;
            for (int i = 0; i <adjList[currVertex].size() ; i++) {
                int vertex = adjList[currVertex].get(i);
                if(vertex!=parent) {
                    if(visited[vertex])
                        return true;
                    else{
                        if (isCycleUtil(vertex, visited, currVertex)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        int vertices = 6;
        Graph g = new Graph(vertices);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 5);
        g.addEdge(5, 2);
        boolean result = g.isCycle();
        System.out.println("is Cycle present: " + result);
    }
}