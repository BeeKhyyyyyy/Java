
import java.util.*;

// Graph class that represents a graph by storing and using adjacency list
// Also adds edges to connect 2 vertices, and calls BFS to display traversal order
class Graph {
    // A data structure/array to store and represent adjacency lists
    LinkedList<Integer>[] adjLists;
    
    // Constructor to initialize the graph with a specified number of vertices
    Graph(int vertices) {
        adjLists=new LinkedList[vertices];
        
        // For-loop to initialize each adjacency list as a new LinkedList
        for (int i=0; i<vertices; i++) {
            adjLists[i]=new LinkedList<>();
        }
    }
    
    // Public method to add an edge between 2 vertices
    public void addEdge(int v, int w) {
        adjLists[v].add(w);    // Adds w to v
        adjLists[w].add(v);    // Adds v to w too since this is an undirected graph
    }
    
    // Public method to print the BFS traversal order of visited nodes starting from a given node
    public void BFS(int start) {
        // Boolean array to keep track of visited nodes
        boolean[] visited=new boolean[adjLists.length];
        
        // Queue for BFS
        Queue<Integer> queue=new LinkedList<>();
        
        // Marks the starting node as visited and enqueues it
        visited[start]=true;
        queue.offer(start);    // Same as .add but this one is generally preferable
        
        System.out.print("BFS Traversal starting from node " + start + ": ");
        
        // Loop until the queue is empty
        while (!queue.isEmpty()) {
            // Dequeues a vertex from the queue and prints it
            int node=queue.poll();
            System.out.print(node + " ");
            
            // For-each loop to get all the adjacent vertices of the dequeued vertex
            // If an adjacent node has not been visited, mark it as visited and enqueue it
            for (int neighbor : adjLists[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor]=true;
                    queue.offer(neighbor);
                }
            }
        }
        System.out.println("");
    }
}

// Main class BFSExample to test and run the program
public class BFSExample {
    // Main method
    public static void main(String[] args) {
        // Graph with 5 vertices
        Graph graph=new Graph(5);
        
        // Add edges between vertices
        graph.addEdge(0, 1);    // 0-1
        graph.addEdge(0, 2);    // 0-2
        graph.addEdge(1, 3);    // 1-3
        graph.addEdge(2, 4);    // 2-4
        
        // Calling BFS method to perform the traversal starting from different nodes
        graph.BFS(0);    // Starting from node 0
        graph.BFS(1);    // Starting from node 1
        graph.BFS(2);    // Starting from node 2
        graph.BFS(3);    // Starting from node 3
        graph.BFS(4);    // Starting from node 4
    }
}
