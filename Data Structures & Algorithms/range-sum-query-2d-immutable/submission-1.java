class NumMatrix {
    public int[][] matrix;
    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    
public int sumRegion(int row1, int col1, int row2, int col2) {
    int summation = 0;

    for (int i = row1; i <= row2; i++) {
        for (int j = col1; j <= col2; j++) {
            summation += matrix[i][j];
        }
    }

    return summation;
}
}