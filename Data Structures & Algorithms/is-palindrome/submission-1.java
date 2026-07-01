class Solution {
    public boolean isPalindrome(String s) {
        /*
        two pointers
        while the 2 pointer indexes are not equal
            if one of them is a space, skip until it isn't
            if values are not equal, return false
            else increment left and decrement right
        return true
        */
        String validLetters = "abcdefghijklmnopqrstuvwxyz0123456789";
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < 36; i++){
            set.add(validLetters.charAt(i));
        }

        s = s.toLowerCase();
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if(!set.contains(s.charAt(left))){
                left++;
            }
            else if(!set.contains(s.charAt(right))){
                right--;
            }
            else if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }
            else return false;
        }
        return true;
    }
}
