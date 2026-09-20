class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int [] freq1 = new int[26];
        int [] freq2 = new int[26];
        for(int i = 0 ; i < s1.length() ; i++)
        {
            char box = s1.charAt(i);
            freq1[box - 'a']++;
        }
        int left = 0;
        for(int right = 0; right < s2.length() ; right++ )
        {
            char alp1 = s2.charAt(right);
            freq2[alp1 - 'a']++;
            int window = right - left + 1;
            if(window > s1.length())
            {
                freq2[s2.charAt(left) - 'a']--;
                left++;
            }
            window = right - left + 1;
            if (window == s1.length())
            {
                if(Arrays.equals(freq1 , freq2))
                {
                    return true;
                }
            }
        }
        return false;
    }
}