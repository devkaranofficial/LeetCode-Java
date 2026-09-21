class Solution {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        int total_sum = 0;
        //Total Sum of Values in array if no missing number is present
        for(int i = 1 ; i <= size ; i++)
        {
            total_sum += i;
        }

        int missing_sum = 0;
        //sum of array with missing value
        for(int i = 0 ; i < nums.length ; i++)
        {
            missing_sum += nums[i];
        }

        int missing_value = total_sum - missing_sum;
        return missing_value;
    }
}