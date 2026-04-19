class Solution {
    public int[] sortedSquares(int[] nums) {
        int lastDigit = nums.length - 1;
        int left = 0;
        int right = lastDigit;
        int pos = lastDigit;

        int[] result = new int[nums.length];

        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[pos] = nums[left] * nums[left];
                left++;
            } else {
                result[pos] = nums[right] * nums[right];
                right--;
            }
            pos--;
        }

        return result;
    }
}