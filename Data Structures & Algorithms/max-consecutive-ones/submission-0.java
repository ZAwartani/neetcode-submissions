class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0;
        int counter = 0;
        int counter_Max_Length = 0;
        while(i < nums.length)
        {
            if(nums[i] == 1){
                counter++;
                i++;
            }else{
                counter_Max_Length = Math.max(counter , counter_Max_Length);
                counter = 0;
                i++;
            }
        }
        counter_Max_Length =  Math.max(counter , counter_Max_Length); 
        return counter_Max_Length;
    }
}