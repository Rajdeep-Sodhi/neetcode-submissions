class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*
        store letters in hashmap along with their indexes
        iternate through letters in s
            if duplicate, 
                calculate if greater than max
                update hashmap
            else add to hashmap and contuine on
        */
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int current = 0;
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                current = Math.max(map.get(s.charAt(i)) + 1, current);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - current+1);
        }
        return max;
    }
}
