class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right)
        {
            if(!Character.isLetterOrDigit(s.charAt(left)))
            {
                left++;
                continue;
            }
            else if(!Character.isLetterOrDigit(s.charAt(right)))
            {
                right--;
                continue;
            }
            char left_char = Character.toLowerCase(s.charAt(left));
            char right_char = Character.toLowerCase(s.charAt(right));
            if(left_char != right_char)
            {
                return false;
            }
            left++;
            right--;
        }
        return true;    
    }
}