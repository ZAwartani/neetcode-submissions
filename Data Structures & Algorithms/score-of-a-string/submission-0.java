class Solution {
    public int scoreOfString(String s) {
        int i = 1;
        int j = i - 1;
        int summation =0;
        while(i < s.length()){
            int one = s.charAt(j);
            int two = s.charAt(i);
            summation = summation + Math.abs(one - two);
            i++;
            j++;
        }
        return summation;
    }
}