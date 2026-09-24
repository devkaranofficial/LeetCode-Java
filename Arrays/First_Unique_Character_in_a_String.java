class Solution {
    public int firstUniqChar(String s) {
        HashMap< Character , Integer > freq = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++)
        {
            char box = s.charAt(i);
            freq.put(box , freq.getOrDefault(box , 0) + 1);
        }
        for(int i = 0 ; i < s.length() ; i++)
        {
            char box = s.charAt(i);
            if(freq.containsKey(box) && freq.get(box) == 1)
            {
                return i;
            }
        }
        return -1;
        
    }
}