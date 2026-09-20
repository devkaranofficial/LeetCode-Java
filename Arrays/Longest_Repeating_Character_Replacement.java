class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0 ; 
        int max_freq = 0;
        int []freq = new int[26];
        int max_length = 0;
        for(int right = 0; right < s.length() ; right++)
        {
            //storing char in another var
            char box = s.charAt(right);
            //updating char freq
            freq[box - 'A']++;
            //updating max_freq after char updation
            max_freq = Math.max(max_freq , freq[box - 'A'] );
            
            
            while((right - left + 1) - max_freq > k)
            {
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            max_length = Math.max(max_length ,right - left + 1 );
            
        }
        return max_length;
    }
}