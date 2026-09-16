public class Solution
{
    public void Rotate(int[] nums, int k)
    {
        int IndexSwap = 0;

        for (int i = 1; i <= k; i++)
        {
            IndexSwap = nums[nums.Length - 1];

            for (int j = nums.Length - 1; j >= 1; j--)
            {
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
            }

            nums[0] = IndexSwap;
        }
    }
}