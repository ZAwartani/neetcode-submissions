class Solution {
    public int [] arr;
    public int[] getConcatenation(int[] nums) {
        arr = new int[nums.length*2];
        int j = 0;
        for(int i = 0 ; i < nums.length;i++)
        {
            arr[j] = nums[i];
            j++;
        }
        for(int i = 0 ; i < nums.length ; i++)
        {
            arr[j] = nums[i];
            j++;
        }
        return arr;    
    }
}
