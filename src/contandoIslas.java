public class contandoIslas {


    public static int numIslands(char[][] grid) {

        Boolean[][] visited = new Boolean[grid.length][grid[0].length];

        //initilize
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                visited[i][j] = false;
            }
        }
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    visited[i][j] = true;
                    result++;
                    markVisited(grid, i, j, visited);
                } else {
                    visited[i][j] = true;
                }
            }
        }

        return result;
    }

    private static void markVisited(char[][] grid, int i, int j, Boolean[][] visited) {
        // chequear arriba

        if (i - 1 >= 0) {
            if (!visited[i - 1][j]) {
                visited[i - 1][j] = true;
                if (grid[i - 1][j] == '1') {
                    markVisited(grid, i - 1, j, visited);
                }
            }
        }
        // chequear abajo
        if (i + 1 < grid.length) {
            if (!visited[i + 1][j]) {
                visited[i + 1][j] = true;
                if (grid[i + 1][j] == '1') {
                    markVisited(grid, i + 1, j, visited);
                }
            }
        }

        // chequear izquierda
        if (j - 1 >= 0) {
            if (!visited[i][j - 1]) {
                visited[i][j - 1] = true;
                if (grid[i][j - 1] == '1') {
                    markVisited(grid, i, j - 1, visited);
                }
            }
        }

        // chequear derecha
        if (j + 1 < grid[i].length) {
            if (!visited[i][j + 1]) {
                visited[i][j + 1] = true;
                if (grid[i][j + 1] == '1') {
                    markVisited(grid, i, j + 1, visited);
                }
            }
        }
    }
}
