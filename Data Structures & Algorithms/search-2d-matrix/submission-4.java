class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left;
        int numberrow = 0;
        int right;
        int mid;

        left = 0;
        right = matrix[numberrow].length - 1;

        while (numberrow < matrix.length) {

            mid = (left + right) / 2;

            if (matrix[numberrow][mid] == target) {
                return true;
            } else if (matrix[numberrow][mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

          
            if (left > right) {
                numberrow++;
                if (numberrow < matrix.length) {   
                    left = 0;
                    right = matrix[numberrow].length - 1;
                }
            }
        }
        return false;
    }
}