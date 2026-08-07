class Solution:
    def isValid(self, s: str) -> bool:
        stack = []

        for character in s:
            if(character == '(' or character == '{' or character == '['):
                stack.append(character)
            else:
                if(len(stack) == 0):
                    return False
                openning = stack.pop()
                if((character == ')' and openning != '(') 
                or (character == '}' and openning != '{') 
                or (character == ']' and openning != '[')): 
                    return False
        return len(stack) == 0

