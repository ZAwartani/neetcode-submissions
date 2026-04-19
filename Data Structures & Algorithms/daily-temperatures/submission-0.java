class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int [] result = new int[temperatures.length];
        int i = 0;
        int countindex = 0;
        while (countindex < temperatures.length) {
            i = countindex;
            stack.clear();

            while (i < temperatures.length) {
                if (temperatures[i] > temperatures[countindex]) {
                    result[countindex] = i - countindex;
                    break;
                }
                i++;
            }

            countindex++;
        }
        return result;
    }
}
