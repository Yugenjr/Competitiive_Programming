import java.util.*;

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

    // Path Compression
    int find(int x) {

        if (parent[x] == x)
            return x;

        return parent[x] = find(parent[x]);
    }

    // Union by Rank
    void union(int a, int b) {

        int rootA = find(a);
        int rootB = find(b);

        // Already in same set
        if (rootA == rootB)
            return;

        // Smaller rank goes under larger rank
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

    public static void main(String[] args) {

        DSU dsu = new DSU(5);

        dsu.union(0, 1);
        dsu.union(1, 2);
        dsu.union(3, 4);

        System.out.println(dsu.find(0));
        System.out.println(dsu.find(2));
        System.out.println(dsu.find(3));
        System.out.println(dsu.find(4));

        if (dsu.find(0) == dsu.find(2))
            System.out.println("0 and 2 are connected");
        else
            System.out.println("0 and 2 are not connected");

        if (dsu.find(0) == dsu.find(3))
            System.out.println("0 and 3 are connected");
        else
            System.out.println("0 and 3 are not connected");
    }
}
