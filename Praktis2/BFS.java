
import java.util.*;

public class BFS {
    public static void main(String[] args) {
        // Graph representation (adjacency list)
        int[][] graph = {
            {},         // index 0
            {2, 3},     // 1 connected to 2 and 3
            {1, 4, 5},  // 2 connected to 1, 4, 5
            {1, 6, 7},  // 3 connected to 1, 6, 7
            {2, 6},     // 4 connected to 2, 6
            {2, 7},     // 5 connected to 2, 7
            {3, 4},     // 6 connected to 3, 4
            {3, 5}      // 7 connected to 3, 5
        };

        boolean[] visited = new boolean[8]; // track visited nodes
        Queue<Integer> queue = new LinkedList<>();

        int start = 2;
        visited[start] = true;
        queue.add(start);

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : graph[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}