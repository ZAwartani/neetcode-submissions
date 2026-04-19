class Solution {
public static int majorityElement(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }

    int Max_key = 0;
    int Max_val = 0;

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        int key = entry.getKey();
        int val = entry.getValue();
        if (val > Max_val && val >= nums.length / 2) {
            Max_val = val;
            Max_key = key;
        }
    }
    return Max_key;
}
}