package august_7_24;

import java.util.*;

/*
 * Class that implements
 * a Graph ADT that contains
 * only undirected edges.
 */
public class Graph {
    private HashMap<Integer, HashSet<Integer>> adjacencyList
    = new HashMap<>();

    public Graph(int vertices) {
        for (int vertex = 0; vertex < vertices; vertex++) {
            adjacencyList.put(vertex, new HashSet<>());
        }
    }

    public void addEdge(int origin, int destination) {
        adjacencyList.get(origin).add(destination);
    }
}
