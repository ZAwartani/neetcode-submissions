public class Solution
{
    public void SortColors(int[] nums)
    {
        int[] count = new int[3];

        foreach (int num in nums)
        {
            count[num]++;
        }

        int index = 0;

        for (int num = 0; num <= 2; num++)
        {
            for (int j = 0; j < count[num]; j++)
            {
                nums[index] = num;
                index++;
            }
        }
    }
}