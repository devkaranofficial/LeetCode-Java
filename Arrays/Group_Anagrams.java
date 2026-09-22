class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap< String , ArrayList<String>> freq = new HashMap<>();

        for(int i = 0 ; i < strs.length ; i++)
        {
            String original = strs[i];
            char [] characters = original.toCharArray();
            Arrays.sort(characters);
            String changed = new String(characters);

            if(!freq.containsKey(changed))
            {
                freq.put(changed , new ArrayList<>());
            }
            freq.get(changed).add(original);

        }
        return new ArrayList<>(freq.values());
        
    }
}