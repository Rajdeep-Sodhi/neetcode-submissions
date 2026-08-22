class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        /*
        keep a non increasing monotic stack of the element's index value 
        iternate through list
            while top of stack if not greater than current element
                pop
                store at pop (this holds an index value), current index - pop
            add to stack once iternation is done
        for every index remaining in the stack, place a zero
        */

        Deque<Integer> stack = new ArrayDeque<>();
        int[] output = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                int pop = stack.pop();
                output[pop] = i - pop;
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            output[stack.pop()] = 0;
        }
        return output;
    }
}
