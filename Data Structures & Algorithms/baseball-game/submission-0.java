class Solution {
    public int calPoints(String[] operations) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {

            if (op.equals("+")) {
                int last = stack.get(stack.size() - 1);
                int beforeLast = stack.get(stack.size() - 2);
                stack.push(last + beforeLast);

            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());

            } else if (op.equals("C")) {
                stack.pop();

            } else {
                stack.push(Integer.parseInt(op));
            }
        }
        while (!stack.isEmpty()) {
            res += stack.pop();
        }

        return res;
    }
}