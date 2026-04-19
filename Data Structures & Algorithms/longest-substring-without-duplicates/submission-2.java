class Solution {
    public int lengthOfLongestSubstring(String s) {
        int Current_length = 0;
        int Max_length = 0;
        HashSet<Character> Current_char = new HashSet<>();
        int start = 0; 
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            while (Current_char.contains(c)) {
                Current_char.remove(s.charAt(start));
                Current_length--;
                start++;
            }

            Current_char.add(c);
            Current_length++;

            if (Current_length > Max_length) {
                Max_length = Current_length;
            }
        }

        return Max_length;
    }
}
