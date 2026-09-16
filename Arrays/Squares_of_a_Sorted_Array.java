class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] result_array = new int[nums.length];
        int i = nums.length - 1;
        while(left <= right)
        {
            int left_sqr = nums[left] * nums[left];
            int right_sqr = nums[right] * nums[right];
            if(left_sqr > right_sqr)
            {
                result_array[i--] = left_sqr;
                left++;
            }
            else
            {
                result_array[i--] = right_sqr;
                right--;
                
            }
           
        }
        return result_array;
    }
}