class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> result_set = new HashSet<>();
        HashSet<Integer> elements = new HashSet<>();
        

        for(int i = 0 ; i < nums1.length ; i++)
        {
            elements.add(nums1[i]);
        }
        for(int i = 0 ; i < nums2.length ; i++)
        {
            if(elements.contains(nums2[i]))
            {
                result_set.add(nums2[i]);
            }
        }
        int [] result = new int[ result_set.size()];
        int index = 0;
        for(int value : result_set)
        {
            result[index] = value;
            index++;
        }
        return  result;
    }
}