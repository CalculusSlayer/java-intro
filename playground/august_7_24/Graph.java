package august_7_24;

import java.util.*;

/*
 * Class that implements
 * a Graph ADT that contains
 * only undirected edges.
 * 
 * Constructors:
 * 
 * public Graph(int vertices) - Constructs
 * a graph with a passed in number of vertices.
 * 
 * Attributes:
 * 
 * private HashMap<Integer, HashSet<Integer>> adjacencyList - Main object
 * used to implement the Graph ADT.
 * 
 * Methods:
 * 
 * public void addEdge(int origin, int destination) - Add edge.
 * 
 * public void removeEdge(int origin, int destination) - Remove edge.
 * 
 * public boolean checkEdge(int origin, int destination) - Check if
 * a certain edge exists.
 * 
 * public Set<Integer> getNeighbors(int vertex) - Get all
 * the neighbors of a vertex.
 * 
 * public Set<Integer> getVertices() - Get all the vertices
 * of the graph.
 * 
 * public String toString() - Provide string representation
 * of the graph.
 * 
 * public void depthFirstSearch(int start, Set)
 * 
 */

public class Graph {
    private Map<Integer, Set<Integer>> adjacencyList
    = new HashMap<>();

    public Graph(int vertices) {
        for (int vertex = 0; vertex < vertices; vertex++) {
            adjacencyList.put(vertex, new HashSet<>());
        }
    }

    public void addEdge(int origin, int destination) {
        adjacencyList.get(origin).add(destination);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, HashSet<Integer>> entry : adjacencyList.entrySet()) {
            sb.append(entry.getKey()).append(" :");
            for (Integer vertex : entry.getValue()) {
                sb.append(" ").append(vertex);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
