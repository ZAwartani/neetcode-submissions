class Solution {
    public int left;
    public int right;
    public int mid;
    public int result;
    public int search(int[] nums, int target) {
        left = 0;
        right = nums.length - 1;
        while(left <= right)
        {
            mid = (left + right) / 2;
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;
    }
}
