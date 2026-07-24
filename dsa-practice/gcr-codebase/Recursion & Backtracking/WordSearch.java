
class WordSearch {

    public boolean exist(char[][] board, String word) {

        int rows = board.length;
        int cols = board[0].length;

        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (dfs(board, word, i, j, 0, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, String word, int row, int col,
                        int index, boolean[][] visited) {

        if (index == word.length()) {
            return true;
        }

        if (row < 0 || row >= board.length ||
            col < 0 || col >= board[0].length ||
            visited[row][col] ||
            board[row][col] != word.charAt(index)) {
            return false;
        }

        visited[row][col] = true;

        boolean found =
                dfs(board, word, row - 1, col, index + 1, visited) ||
                dfs(board, word, row + 1, col, index + 1, visited) ||
                dfs(board, word, row, col - 1, index + 1, visited) ||
                dfs(board, word, row, col + 1, index + 1, visited);

        visited[row][col] = false;

        return found;
    }

    public static void main(String[] args) {

        WordSearch obj = new WordSearch();

        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        String word = "ABCCED";

        System.out.println(obj.exist(board, word));
    }
}