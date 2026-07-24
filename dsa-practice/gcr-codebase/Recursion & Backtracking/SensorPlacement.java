import java.util.*;

class SensorPlacement {

    public List<List<String>> placeSensors(int n) {
        List<List<String>> result = new ArrayList<>();

        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        backtrack(0, board, result);

        return result;
    }

    private void backtrack(int row, char[][] board, List<List<String>> result) {

        if (row == board.length) {
            List<String> temp = new ArrayList<>();

            for (char[] r : board) {
                temp.add(new String(r));
            }

            result.add(temp);
            return;
        }

        for (int col = 0; col < board.length; col++) {

            if (isSafe(board, row, col)) {

                board[row][col] = 'S';

                backtrack(row + 1, board, result);

                board[row][col] = '.';
            }
        }
    }

    private boolean isSafe(char[][] board, int row, int col) {

        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'S') {
                return false;
            }
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'S') {
                return false;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'S') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        SensorPlacement obj = new SensorPlacement();

        int n = 4;

        List<List<String>> ans = obj.placeSensors(n);

        for (List<String> board : ans) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}