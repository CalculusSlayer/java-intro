package august_7_24;

import java.util.*;

public class Graph {
    private HashMap<Integer, HashSet<Integer>> adjacencyList;

    public Graph(int vertices) {
        for (int vertex = 0; vertex < vertices; vertex++) {
            adjacencyList.put(vertex, new HashSet<>());
        }
    }
}
