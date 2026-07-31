class Solution {
    public String minWindow(String s, String t) {
        /*
        2 hashmaps
            first contains all letters in t and their freq
            second contains all letters in t and their freq set to 0
            2 ints to count the if the conditions in the 2 hashmaps are the same
        outer loop - iternate by 1 from left to right
            if letter at index is in t hashmap, then add it to s hashmap / update
            if have and need are equal, 
                compute result
                while equal keep subtracting letters from the 
                left side until they're not equal
        return result
        */
        HashMap<Character, Integer> tMap = new HashMap<>();
        HashMap<Character, Integer> sMap = new HashMap<>();

        for(char letter : t.toCharArray()){
            tMap.put(letter, tMap.getOrDefault(letter, 0) + 1);
        }

        int need = tMap.size();
        int have = 0;
        int[] result = new int[2];
        result[1] = Integer.MAX_VALUE;
        int l = 0;

        for(int r = 0; r < s.length(); r++){
            char letter = s.charAt(r);
            if(tMap.containsKey(letter)){
                sMap.put(letter, sMap.getOrDefault(letter, 0) + 1);
                if(sMap.get(letter) == tMap.get(letter))
                    have++;
                while(have == need){
                    if(r-l < result[1] - result[0]){
                        result[0] = l;
                        result[1] = r;
                    }
                    char leftLetter = s.charAt(l);
                    if(tMap.containsKey(leftLetter)){
                        sMap.put(leftLetter, sMap.get(leftLetter) - 1);
                        if(sMap.get(leftLetter) < tMap.get(leftLetter))
                            have--;
                    }
                    l++;
                }
            }
        }
        if(result[1] == Integer.MAX_VALUE) return "";
        return s.substring(result[0], result[1]+1);
    }
}
