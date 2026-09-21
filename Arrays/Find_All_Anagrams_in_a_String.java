class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int [] freq_1 = new int[26];
        int [] freq_2 = new int[26];
        int left = 0;
        
        //adding freq of char of p in freq2
        for(int i = 0 ; i < p.length() ; i++)
        {
            char alphabet = p.charAt(i);
            freq_2[alphabet - 'a']++;
        }

        //using sliding window logic on string s
        for(int right = 0; right < s.length() ; right++)
        {
            int alphabet = s.charAt(right);
            freq_1[alphabet - 'a']++;
            int window = right - left + 1;


            //Checking if window is more than req length
            if(window > p.length())
            {
                freq_1[s.charAt(left) - 'a']--;
                left++;
            }

            //calculating window again
            window = right - left + 1;
            if(window == p.length())
            {
                if(Arrays.equals(freq_1 , freq_2))
                {
                    result.add(left);
                }
            }

        }
        return result;
        
    }
}