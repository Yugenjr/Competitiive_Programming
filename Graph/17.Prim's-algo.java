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

    static void prim(int src, ArrayList<ArrayList<Edge>> g, int V) {

        boolean[] visited = new boolean[V];

        PriorityQueue<int[]> pq =
            new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        pq.offer(new int[]{0, src});

        int mstWeight = 0;

        while (!pq.isEmpty()) {

            int wt = pq.peek()[0];
            int u = pq.peek()[1];

            pq.poll();

            if (visited[u])
                continue;

            visited[u] = true;

            mstWeight += wt;

            for (Edge e : g.get(u)) {

                if (!visited[e.v]) {
                    pq.offer(new int[]{e.wt, e.v});
                }
            }
        }

        System.out.println("MST Weight = " + mstWeight);
    }

    public static void main(String[] args) {

        int V = 5;

        ArrayList<ArrayList<Edge>> g = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            g.add(new ArrayList<>());
        }

        g.get(0).add(new Edge(1, 2));
        g.get(1).add(new Edge(0, 2));

        g.get(0).add(new Edge(3, 6));
        g.get(3).add(new Edge(0, 6));

        g.get(1).add(new Edge(2, 3));
        g.get(2).add(new Edge(1, 3));

        g.get(1).add(new Edge(3, 8));
        g.get(3).add(new Edge(1, 8));

        g.get(1).add(new Edge(4, 5));
        g.get(4).add(new Edge(1, 5));

        g.get(2).add(new Edge(4, 7));
        g.get(4).add(new Edge(2, 7));

        g.get(3).add(new Edge(4, 9));
        g.get(4).add(new Edge(3, 9));

        prim(0, g, V);
    }
}
