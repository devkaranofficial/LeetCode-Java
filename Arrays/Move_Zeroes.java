class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        int box;
        for(int i = 0 ; i < nums.length ;i++)
        {
            if (nums[i] != 0 )
            {
                box = nums[j];
                nums[j] = nums[i];
                nums[i] = box;
                j++;
            }
        }
        
    }
}
