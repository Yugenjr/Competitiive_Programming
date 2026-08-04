class Solution {

    public int numIslands(char[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        boolean[][] visited = new boolean[rows][cols];

        int islands = 0;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == '1' && !visited[i][j]) {

                    islands++;
                    dfs(grid, visited, i, j);

                }

            }

        }

        return islands;

    }

    private void dfs(char[][] grid, boolean[][] visited, int row, int col) {

        int rows = grid.length;
        int cols = grid[0].length;

        // Boundary check
        if (row < 0 || col < 0 || row >= rows || col >= cols)
            return;

        // Water or already visited
        if (grid[row][col] == '0' || visited[row][col])
            return;

        visited[row][col] = true;

        // Up
        dfs(grid, visited, row - 1, col);

        // Down
        dfs(grid, visited, row + 1, col);

        // Left
        dfs(grid, visited, row, col - 1);

        // Right
        dfs(grid, visited, row, col + 1);

    }
}
