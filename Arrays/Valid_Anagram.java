class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        int [] freq_1 = new int[26];
        int [] freq_2 = new int[26];
        
        for(int i = 0; i < s.length() ; i++)
        {
            char box = s.charAt(i);
            freq_1[box - 'a']++;
        }
        for(int i = 0 ; i < t.length() ; i++)
        {
            char box = t.charAt(i);
            freq_2[box - 'a']++;
        }

        if(s.length() == t.length())
        {
            if(Arrays.equals(freq_1 , freq_2))
            {
                return true;
            }
        }
        return false;
    }
}