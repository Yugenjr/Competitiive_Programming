public boolean hasCycle() {

    Set<Integer> visited = new HashSet<>();

    for (int vertex : adjList.keySet()) {

        if (!visited.contains(vertex)) {

            if (bfsCycle(vertex, visited))
                return true;
        }
    }

    return false;
}

private boolean bfsCycle(int start, Set<Integer> visited) {

    Queue<int[]> queue = new LinkedList<>();

    queue.offer(new int[]{start, -1});
    visited.add(start);

    while (!queue.isEmpty()) {

        int[] current = queue.poll();

        int node = current[0];
        int parent = current[1];

        for (int neighbour : adjList.get(node)) {

            if (!visited.contains(neighbour)) {

                visited.add(neighbour);
                queue.offer(new int[]{neighbour, node});

            } else if (neighbour != parent) {

                return true;

            }
        }
    }

    return false;
}
