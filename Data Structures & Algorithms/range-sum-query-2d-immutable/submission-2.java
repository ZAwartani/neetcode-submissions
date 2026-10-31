class NumMatrix {
    public int[][] matrix;
    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    
public int sumRegion(int row1, int col1, int row2, int col2) {
    int ptrcol = col1;
    int summation = 0;
    while (row1 <= row2) {
        summation += matrix[row1][ptrcol];

        if (ptrcol == col2) {
            row1++;
            ptrcol = col1;
        } else {
            ptrcol++;
        }
    }
        return summation;
    }
}