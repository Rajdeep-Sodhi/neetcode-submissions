class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        '''
        iternate through list
            if its a number add to stacl
            else get the past 2 numbers and perform (second pop operator first pop)
                once you have perform the operator, place the result back in the stack
        return the first pop in the stack
        '''
        stack = []
        for c in tokens:
            if c == "+":
                stack.append(stack.pop() + stack.pop())
            elif c == "-":
                a, b = stack.pop(), stack.pop()
                stack.append(b - a)
            elif c == "*":
                stack.append(stack.pop() * stack.pop())
            elif c == "/":
                a, b = stack.pop(), stack.pop()
                stack.append(int(float(b) / a))
            else:
                stack.append(int(c))
        return stack[0]

        