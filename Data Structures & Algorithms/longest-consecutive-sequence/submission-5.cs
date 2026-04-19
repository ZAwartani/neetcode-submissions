public class Solution {
    public int LongestConsecutive(int[] nums) {
    if (nums.Length == 0) return 0;

    int min = nums.Min();
    int max = nums.Max();

    int[] arr = new int[max - min + 1];

    // mark presence
    foreach (int num in nums)
    {
        arr[num - min] = 1;
    }

    int greatestStreak = 0;
    int counter = 0;

    for (int i = 0; i < arr.Length; i++)
    {
        if (arr[i] == 1)
        {
            counter++;
            greatestStreak = Math.Max(greatestStreak, counter);
        }
        else
        {
            counter = 0;
        }
    }

    return greatestStreak;
        }
    }