class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res = "";
        int index_word1 = 0;
        int index_word2 = 0;
        while(index_word1 < word1.length() || index_word2 < word2.length())
        {
            if(index_word1 < word1.length())
            {
                res += word1.charAt(index_word1);
                index_word1++;
            }
            if(index_word2 < word2.length())
            {
                res += word2.charAt(index_word2);
                index_word2++;
            }
        }
        return res;                
    }
}