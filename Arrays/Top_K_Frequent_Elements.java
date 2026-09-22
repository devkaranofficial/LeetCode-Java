class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> freq = new HashMap<>();

       for(int num : nums)
       {
        freq.put(num , freq.getOrDefault(num , 0) + 1);
       }
       int [] result = new int[k];
       ArrayList<Integer> keys = new ArrayList<>(freq.keySet());
       keys.sort((a,b) -> freq.get(b) - freq.get(a));

       for(int i = 0 ; i < k ; i++)
       {
        result[i] = keys.get(i);
       }     
       return result;
    }
}