import java.util.*;

class Solution {

    static ArrayList<Integer> topoSort(int V, ArrayList<ArrayList<Integer>> adj) {

        int[] indegree = new int[V];

        // Calculate indegree of every vertex
        for (int i = 0; i < V; i++) {
            for (int neighbour : adj.get(i)) {
                indegree[neighbour]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();

        // Add all vertices with indegree 0
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        ArrayList<Integer> topo = new ArrayList<>();

        while (!queue.isEmpty()) {

            int node = queue.poll();
            topo.add(node);

            for (int neighbour : adj.get(node)) {

                indegree[neighbour]--;

                if (indegree[neighbour] == 0) {
                    queue.offer(neighbour);
                }
            }
        }

        return topo;
    }
}
