package august_7_24;

import java.util.*;

/*
 * Class that implements
 * a Graph ADT that contains
 * only undirected edges.
 */
public class Graph {
    private HashMap<Integer, HashSet<Integer>> adjacencyList;

    public Graph(int vertices) {
        for (int vertex = 0; vertex < vertices; vertex++) {
            adjacencyList.put(vertex, new HashSet<>());
        }
    }

    public 
}
