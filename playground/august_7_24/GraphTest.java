package august_7_24;

public class GraphTest {
    public void constructorTest() {
        int vertices = 3;
        Graph graph1 = new Graph(vertices);
        int actualResult = graph1.getVertexCount();
        assert actualResult == vertices : String.format("Expected %s but instead got %s", vertices, actualResult);
    }
    public static void main(String[] args) {
        GraphTest graphTest = new GraphTest();
        graphTest.constructorTest();
        // Graph graph = new Graph(5);
        // graph.addEdge(0, 1);
        // graph.addEdge(0, 4);
        // graph.addEdge(0, 3);
        // graph.addEdge(1, 2);
        // graph.addEdge(1, 3);
        // graph.addEdge(1, 4);
        // graph.addEdge(2, 3);
        // graph.addEdge(3, 4);

        // String expectedResult = """
        //                         0 : 1 3 4
        //                         1 : 2 3 4
        //                         2 : 3
        //                         3 : 4
        //                         4 :
        //                         """;
        // String actualResult = graph.toString();
        // assert actualResult.equals(expectedResult) : 
        // String.format("Expect `%s`\nbut instead got `%s`", expectedResult, actualResult);
        // System.out.println(String.format("graph:\n%s", graph));
    }
}
