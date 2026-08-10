import java.util.*;

class Edge {
    int v;
    int wt;

    Edge(int v, int wt) {
        this.v = v;
        this.wt = wt;
    }
}

class Main {

    static void bellmanFord(int src, ArrayList<ArrayList<Edge>> g, int V) {

        int[] dist = new int[V];

        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[src] = 0;

        // V - 1 iterations
        for (int i = 0; i < V - 1; i++) {

            for (int u = 0; u < V; u++) {

                for (Edge e : g.get(u)) {

                    if (dist[u] != Integer.MAX_VALUE &&
                        dist[e.v] > dist[u] + e.wt) {

                        dist[e.v] = dist[u] + e.wt;
                    }
                }
            }
        }

        for (int i = 0; i < V; i++) {
            System.out.print(dist[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int V = 5;

        ArrayList<ArrayList<Edge>> g = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            g.add(new ArrayList<>());
        }

        g.get(0).add(new Edge(1, 4));
        g.get(0).add(new Edge(2, 2));

        g.get(1).add(new Edge(2, -3));
        g.get(1).add(new Edge(3, 2));

        g.get(2).add(new Edge(3, 3));
        g.get(3).add(new Edge(4, -2));

        bellmanFord(0, g, V);
    }
}
