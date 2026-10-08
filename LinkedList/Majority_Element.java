class Solution {
    public int majorityElement(int[] nums) {
        int number = nums[0];
        int count = 1;
        for(int i = 1 ; i < nums.length ; i++)
        {
            if(number == nums[i])
            {
                count++;
            }
            else
            {
                count--;
                if(count == 0)
                {
                    number = nums[i];
                    count = 1;
                }
            }
        }
        return number;
    }
}