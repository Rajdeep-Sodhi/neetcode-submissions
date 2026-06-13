class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        letter_array = [0] * 26
        for i in range(len(s)):
            letter_array[ord(s[i]) - ord('a')] += 1
        for j in range(len(t)):
            letter_array[ord(t[j]) - ord('a')] -= 1
        for k in range(len(letter_array)):
            if(letter_array[k] != 0):
                return False
        return True
