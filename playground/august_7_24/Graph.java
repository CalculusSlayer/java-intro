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
 * private vertexCount - Number of vertices.
 * 
 * private edgeCount - Number of edges.
 * 
 * Methods:
 * 
 * (y, n)
 * public void addEdge(int origin, int destination) - Add edge.
 * 
 * (y, n)
 * public void removeEdge(int origin, int destination) - Remove edge.
 * 
 * (y, n)
 * public boolean hasEdge(int origin, int destination) - Check if
 * a certain edge exists.
 * 
 * public int getVertexCount() - Returns number of vertices in graph.
 * 
 * public int getEdgeCount() - Returns number of edges in graph.
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
 * public void depthFirstSearch(int start, Set<Integer> visited) - Print
 * out all the vertices traversed to from an origin `start`.
 * 
 */

public class Graph {
    private Map<Integer, Set<Integer>> adjacencyList
    = new HashMap<>();
    private int vertexCount = 0;
    private int edgeCount = 0;

    public Graph(int vertices) {
        for (int vertex = 0; vertex < vertices; vertex++) {
            adjacencyList.put(vertex, new HashSet<>());
        }
        vertexCount = vertices;
    }

    public void addEdge(int origin, int destination) {
        if (!hasEdge(origin, destination)) {
            adjacencyList.get(origin).add(destination);
            edgeCount++;
        }
    }

    public void removeEdge(int origin, int destination) {
        if (hasEdge(origin, destination)) {
            adjacencyList.get(origin).remove(destination);
            edgeCount--;
        }
    }

    public boolean hasEdge(int origin, int destination) {
        return adjacencyList.get(origin).contains(destination);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, Set<Integer>> entry : adjacencyList.entrySet()) {
            sb.append(entry.getKey()).append(" :");
            for (Integer vertex : entry.getValue()) {
                sb.append(" ").append(vertex);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
