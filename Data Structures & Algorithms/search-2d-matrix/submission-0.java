class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left;
        int numberrow = 0;
        int right;
        int mid;    
        while(numberrow < matrix.length)
        {
        	left = 0;
        	right = matrix[numberrow].length - 1;
        	while(left <= right)
        	{
        		mid = (left + right) / 2;
        		if(matrix[numberrow][mid] == target)
        		{
        			return true;
        		}
        		else if(matrix[numberrow][mid] > target)
        		{
        			right = mid - 1;
        		}
        		else {
        			left = mid + 1;
        		}
        	}
        	numberrow++;
        }
        return false;
    }
}