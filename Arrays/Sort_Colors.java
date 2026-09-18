class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int mid = 0;
        int right = nums.length - 1;
        while(mid <= right)
        {
            if(nums[mid] == 0)
            {
                int box = nums[left];
                nums[left] = nums[mid];
                nums[mid] = box;
                left++;
                mid++;
            }
            else if(nums[mid] == 1)
            {
                mid++;
            }
            else
            {
                int box = nums[right];
                nums[right] = nums[mid];
                nums[mid] = box;
                right--;
            }
        }
        
    }
}