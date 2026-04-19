class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        array = set()
        for i in nums :
            array.add(i)
        return len(array) < len(nums)
        