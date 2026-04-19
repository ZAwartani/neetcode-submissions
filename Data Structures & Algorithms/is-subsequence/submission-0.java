class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0; // pointer for t

        for (int i = 0; i < s.length(); i++) {
            boolean found = false;

            for (; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    found = true;
                    j++; // move forward in t
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }
}