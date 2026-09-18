class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int min_element = Integer.MAX_VALUE;
        for(int right = 0; right < nums.length; right++)
        {
            sum += nums[right];
            while(sum >= target)
            {
                int length = right - left + 1;
                min_element = Math.min(min_element, length);
                sum -= nums[left];
                left++;
            }
        }
        return min_element == Integer.MAX_VALUE ? 0 : min_element;
    }
}