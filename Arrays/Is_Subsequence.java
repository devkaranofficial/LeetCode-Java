class Solution {
    public boolean isSubsequence(String s, String t) {
        int left = 0;
        int right = 0;
        while(right < t.length() && left < s.length())
        {
            if(s.charAt(left) == t.charAt(right))
            {
                left++;
                right++;
            }
            else
            {
                right++;
            }
        }

        if (left < s.length())
        {
            return false;
        }
        else
        {
            return true;
        }
        
    }
}