import java.util.*;

class Edge {
    int u;
    int v;
    int wt;

    Edge(int u, int v, int wt) {
        this.u = u;
        this.v = v;
        this.wt = wt;
    }
}

class DSU {

    int[] parent;
    int[] rank;

    DSU(int n) {

        parent = new int[n];
        rank = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    int find(int x) {

        if (parent[x] == x)
            return x;

        return parent[x] = find(parent[x]);
    }

    void union(int a, int b) {

        int rootA = find(a);
        int rootB = find(b);

        if (rootA == rootB)
            return;

        if (rank[rootA] < rank[rootB]) {

            parent[rootA] = rootB;

        } else if (rank[rootA] > rank[rootB]) {

            parent[rootB] = rootA;

        } else {

            parent[rootB] = rootA;
            rank[rootA]++;
        }
    }
}

public class Main {

    static int kruskal(ArrayList<Edge> edges, int V) {

        // Sort edges by weight
        edges.sort((a, b) -> Integer.compare(a.wt, b.wt));

        DSU dsu = new DSU(V);

        int minCost = 0;
        int edgeCount = 0;

        for (Edge e : edges) {

            int rootU = dsu.find(e.u);
            int rootV = dsu.find(e.v);

            // If different components, add edge
            if (rootU != rootV) {

                minCost += e.wt;
                edgeCount++;

                dsu.union(rootU, rootV);

                System.out.println(
                    e.u + " - " + e.v + " : " + e.wt
                );

                // MST needs V - 1 edges
                if (edgeCount == V - 1)
                    break;
            }
        }

        return minCost;
    }

    public static void main(String[] args) {

        int V = 5;

        ArrayList<Edge> edges = new ArrayList<>();

        edges.add(new Edge(0, 1, 2));
        edges.add(new Edge(0, 3, 6));
        edges.add(new Edge(1, 2, 3));
        edges.add(new Edge(1, 3, 8));
        edges.add(new Edge(1, 4, 5));
        edges.add(new Edge(2, 4, 7));
        edges.add(new Edge(3, 4, 9));

        int ans = kruskal(edges, V);

        System.out.println("MST Cost = " + ans);
    }
}
