// Detect Cycle
public boolean hasCycle() {

    Set<Integer> visited = new HashSet<>();

    for (int vertex : adjList.keySet()) {

        if (!visited.contains(vertex)) {

            if (dfsCycle(vertex, -1, visited))
                return true;

        }
    }

    return false;
}

// DFS Helper
private boolean dfsCycle(int node, int parent, Set<Integer> visited) {

    visited.add(node);

    for (int neighbour : adjList.get(node)) {

        if (!visited.contains(neighbour)) {

            if (dfsCycle(neighbour, node, visited))
                return true;

        }
        else if (neighbour != parent) {

            return true;

        }

    }

    return false;

}
