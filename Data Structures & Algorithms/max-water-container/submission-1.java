class Solution {
    public int maxArea(int[] heights) {
        int result = 0;
        int left = 0;
        int right = heights.length-1;
        while(left != right)
        {
            int tempsummation = 0;
            int height = Math.min(heights[left], heights[right]); 
            int width = right - left;
            int area = height * width;
            if (area > result) {
                result = area;
            }

            if(heights[left] < heights[right])
            {
                left++;
            }
            else{
                right--;
            }
        }
        return result;
    }
}
