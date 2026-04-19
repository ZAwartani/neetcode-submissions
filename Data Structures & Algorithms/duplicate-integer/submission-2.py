class Solution:
    def hasDuplicate(self, nums:list[int]) -> bool:
        theset = set(nums)
        if len(theset) != len(nums) :
            return True
        else :
            return False

print(Solution().hasDuplicate([1, 2, 3, 3]))