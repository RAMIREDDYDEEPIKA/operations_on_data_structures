public class Graph<T> {

    public Object[] vertices;
    public Object[][] adjMatrix;
    public int vertexCount;

    public Graph(int maxVertices) {
        vertices = new Object[maxVertices];
        adjMatrix = new Object[maxVertices][maxVertices];
        vertexCount = 0;
        for (int i = 0; i < maxVertices; i++) {
            for (int j = 0; j < maxVertices; j++) {
                adjMatrix[i][j] = null;
            }
        }
    }

    public void addVertex(int index, T data) {
        if (index >= 0 && index < vertices.length && vertices[index] == null) {
            vertices[index] = data;
            vertexCount++;
        }
    }

    public void addEdge(int vertex1Index, int vertex2Index) {
        if (vertex1Index >= 0 && vertex1Index < vertices.length &&
                vertex2Index >= 0 && vertex2Index < vertices.length) {
            adjMatrix[vertex1Index][vertex2Index] = true;
            adjMatrix[vertex2Index][vertex1Index] = true;
        }
    }

    public void removeVertex(int vertexIndex) {
        if (vertexIndex >= 0 && vertexIndex < vertices.length && vertices[vertexIndex] != null) {
            for (int i = 0; i < vertices.length; i++) {
                adjMatrix[vertexIndex][i] = null;
                adjMatrix[i][vertexIndex] = null;
            }
            vertices[vertexIndex] = null;
            vertexCount--;
        }
    }

    public void removeEdge(int vertex1Index, int vertex2Index) {
        if (vertex1Index >= 0 && vertex1Index < vertices.length &&
                vertex2Index >= 0 && vertex2Index < vertices.length) {
            adjMatrix[vertex1Index][vertex2Index] = null;
            adjMatrix[vertex2Index][vertex1Index] = null;
        }
    }

    public void bfs(int startIndex) {
        boolean[] visited = new boolean[vertices.length];
        Graph<Integer> queue = new Graph<>(vertices.length);
        queue.addVertex(0, startIndex);
        visited[startIndex] = true;

        while (queue.vertexCount > 0) {
            int currentIndex = (int) queue.vertices[0];
            queue.removeVertex(0);
            System.out.print(vertices[currentIndex] + " ");
            for (int i = 0; i < vertices.length; i++) {
                if (adjMatrix[currentIndex][i] != null && !visited[i]) {
                    queue.addVertex(queue.vertexCount, i);
                    visited[i] = true;
                }
            }
        }
        System.out.println();
    }

    public void dfs(int startIndex) {
        boolean[] visited = new boolean[vertices.length];
        dfsHelper(startIndex, visited);
        System.out.println();
    }

    private void dfsHelper(int currentIndex, boolean[] visited) {
        visited[currentIndex] = true;
        System.out.print(vertices[currentIndex] + " ");
        for (int i = 0; i < vertices.length; i++) {
            if (adjMatrix[currentIndex][i] != null && !visited[i]) {
                dfsHelper(i, visited);
            }
        }
    }
}