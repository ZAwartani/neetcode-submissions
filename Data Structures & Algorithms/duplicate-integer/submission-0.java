class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean result = true;
        HashSet<Integer> array_not_duplicate = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++)
        {
            array_not_duplicate.add(nums[i]);
        }
        if(array_not_duplicate.size() < nums.length){
         return result;      
        }
        else {
            result = false;
            return result;
        }
    }
}