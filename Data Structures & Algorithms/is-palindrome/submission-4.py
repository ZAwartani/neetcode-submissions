class Solution:
    def isPalindrome(self, s: str) -> bool:
        news = ""
        for char in s:
            if char.isalpha():
                news += char.lower()
            elif char.isdigit():
                news += char
        news.strip()
        i = 0
        j = len(news) - 1

        if len(news) < 2 :
            return True
        while i < j :
            if news[i] != news[j] :
                return False
            else :
                i+=1
                j-=1
        return True