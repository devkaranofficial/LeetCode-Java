class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_count = 0;
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] == 1)
            {
                count++;
            }
            max_count = Math.max(max_count , count);
            if(nums[i] != 1)
            {
                count = 0;
            }
            
        } 
        return max_count;
        
    }
}