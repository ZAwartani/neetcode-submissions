class Solution {
    boolean result = true; 
    public boolean isValidSudoku(char[][] board) {  
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (!isValid(board, i, j)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    private boolean isValid(char[][] board, int i, int j) {
        char c = board[i][j];
        // Check row
        for (int k = 0; k < 9; k++) {
            if (k != j && board[i][k] == c) {
                return false;
            }
        }
        // Check column
        for (int k = 0; k < 9; k++) {
            if (k != i && board[k][j] == c) {
                return false;
            }
        }
        // Check 3x3 box
        int boxRow = (i / 3) * 3;
        int boxCol = (j / 3) * 3;
        for (int k = boxRow; k < boxRow + 3; k++) {
            for (int l = boxCol; l < boxCol + 3; l++) {
                if (k != i && l != j && board[k][l] == c) {
                    return false;
                }
            }
        }
        return true;
    }
}