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
        s = s.toLowerCase();
        int left = 0;
        int right = s.length()-1;
        int leftChar = (int) s.charAt(left);
        int rightChar = (int) s.charAt(right);
        while(left < right){
            if(leftChar < 48 || leftChar > 57 && leftChar < 65 
            || leftChar > 90 && leftChar < 97 || leftChar > 122){
                left++;
                leftChar = (int) s.charAt(left);
            }
            else if(rightChar < 48 || rightChar > 57 && rightChar < 65 
            || rightChar > 90 && rightChar < 97 || rightChar > 122){
                right--;
                rightChar = (int) s.charAt(right);
            }
            else if(leftChar == rightChar){
                left++;
                right--;
                leftChar = (int) s.charAt(left);
                rightChar = (int) s.charAt(right);
            }
            else return false;
        }
        return true;
    }
}
