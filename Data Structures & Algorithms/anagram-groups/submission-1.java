class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {        
        List<List<String>> result = new ArrayList<>();
        HashMap<String, Integer> countToIndex = new HashMap<>();

        for(String str : strs){
            int[] count = new int[26];
            int base = (int) 'a';
            for(int c = 0; c < str.length(); c++){
                count[(int) str.charAt(c) - base]++;
            }
            String convert = Arrays.toString(count);

            countToIndex.putIfAbsent(convert, result.size());
            if(countToIndex.get(convert) == result.size()){
                result.add(new ArrayList<>());
            }
            result.get(countToIndex.get(convert)).add(str);
        }

        return result;
    }
}
