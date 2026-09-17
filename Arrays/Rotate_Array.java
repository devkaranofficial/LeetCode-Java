class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        for(int i = 0 ; i < (nums.length)/2 ; i++)
        {
            int box = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = box;
        }
        for(int i = 0 ; i < (k)/2 ; i++)
        {
            int box = nums[i];
            nums[i] = nums[k - 1 - i];
            nums[k - 1 - i] = box;
        }
     int left = k;
     int right = nums.length - 1;
     while(left < right)
        {
            int box = nums[left];
            nums[left] = nums[right];
            nums[right] = box;
            left++;
            right--;
        }
        
    }
}