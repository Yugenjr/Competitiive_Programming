import java.util.*;

class Graph {

    private Map<Integer, List<Integer>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addVertex(int v) {
        adjList.putIfAbsent(v, new ArrayList<>());
    }

    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }

    public void printGraph() {

        for (var entry : adjList.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }

    public void bfs(int start) {

        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        q.offer(start);
        visited.add(start);

        while (!q.isEmpty()) {

            int node = q.poll();

            System.out.print(node + " ");

            for (int neighbour : adjList.get(node)) {

                if (!visited.contains(neighbour)) {

                    visited.add(neighbour);
                    q.offer(neighbour);

                }

            }

        }

    }

}

public class Main {

    public static void main(String[] args) {

        Graph g = new Graph();

        g.addVertex(1);
        g.addVertex(2);
        g.addVertex(3);
        g.addVertex(4);
        g.addVertex(5);

        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(2,4);
        g.addEdge(2,5);

        g.printGraph();

        System.out.println("\nBFS Traversal:");

        g.bfs(1);

    }

}
