class Solution {
    Stack<Integer> stack = new Stack<>();
    int[] arr;

    public int[] asteroidCollision(int[] asteroids) {

        for (int i = 0; i < asteroids.length; i++) {

            if (stack.size() == 0) {
                stack.add(asteroids[i]);
                continue;
            }

            while (!stack.isEmpty() && asteroids[i] < 0 && stack.getLast() > 0) {

                if (Math.abs(asteroids[i]) == stack.getLast()) {
                    stack.pop();
                    asteroids[i] = 0;
                    break;
                }
                else if (Math.abs(asteroids[i]) > stack.getLast()) {
                    stack.pop();
                }
                else {
                    asteroids[i] = 0;
                    break;
                }
            }

            if (asteroids[i] != 0) {
                stack.add(asteroids[i]);
            }
        }

        arr = new int[stack.size()];

        for (int i = 0; i < stack.size(); i++) {
            arr[i] = stack.get(i);
        }

        return arr;
    }
}
