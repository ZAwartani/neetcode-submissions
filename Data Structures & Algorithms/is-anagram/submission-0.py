class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        theresult = True 
        thelist = [0] * 126
        for char in t:
            charOfAscii = ord(char)
            thelist[charOfAscii] += 1
        
        for char in s :
            charOfAscii = ord(char)
            thelist[charOfAscii] -= 1
        
        for num in thelist :
            if num != 0 :
                theresult= False
                break
        
        return theresult
    