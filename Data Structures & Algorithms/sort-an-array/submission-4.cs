public class Solution {
    public int[] SortArray(int[] nums) {
      int min = nums[0];
        int max = nums[0];

        for (int i = 0; i < nums.Length; i++)
        {
            if (nums[i] < min)
            {
                min = nums[i];
            }

            if (nums[i] > max)
            {
                max = nums[i];
            }
        }

        int[] array_index = new int[max - min + 1];

        for (int i = 0; i < nums.Length; i++)
        {
            array_index[nums[i] - min]++;
        }

        int index = 0;

        for (int i = 0; i < array_index.Length; i++)
        {
            while (array_index[i] > 0)
            {
                nums[index++] = i + min;
                array_index[i]--;
            }
        }

        return nums;
    }
}