class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();

        String[] parts = path.split("/");

        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                continue;
            }

            if (part.equals("..")) {
                if (!st.empty()) {
                    st.pop();
                }
            } else {
                st.push(part);
            }
        }

        String result = "";

        while (!st.empty()) {
            result = "/" + st.pop() + result;
        }

        return result.isEmpty() ? "/" : result;
    }
}