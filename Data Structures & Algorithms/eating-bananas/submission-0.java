class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        int result = right; // أصغر قيمة k

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sumHours = 0;
            int count = 0;

            do {
                sumHours += Math.ceil((double) piles[count] / mid);

                if (count == piles.length - 1) {
                    break;
                }

                count++;

                if (sumHours > h) {
                    break;
                }

            } while (true);

            if (sumHours <= h) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }
}
