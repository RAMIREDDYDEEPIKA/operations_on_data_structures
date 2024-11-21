public class GraphMain{
    public static void main(String[] args) {
        Graph<String> graph = new Graph<>(5);

        graph.addVertex(0, "A");
        graph.addVertex(1, "B");
        graph.addVertex(2, "C");
        graph.addVertex(3, "D");
        graph.addVertex(4, "E");

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);

        System.out.println("BFS Traversal:");
        graph.bfs(0);

        System.out.println("DFS Traversal:");
        graph.dfs(0);

        graph.removeEdge(1, 4);
        System.out.println("After removing edge between B and E:");

        System.out.println("BFS Traversal:");
        graph.bfs(0);

        System.out.println("DFS Traversal:");
        graph.dfs(0);

        graph.removeVertex(3);
        System.out.println("After removing vertex D:");

        System.out.println("BFS Traversal:");
        graph.bfs(0);

        System.out.println("DFS Traversal:");
        graph.dfs(0);
    }
}