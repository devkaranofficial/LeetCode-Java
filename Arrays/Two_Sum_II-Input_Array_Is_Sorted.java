class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0 ; 
        int right = numbers.length - 1;
        while(left < right)
        {
            int left_val = numbers[left];
            int right_val = numbers[right];
            int sum = left_val + right_val;
            if(sum == target)
            {
                return new int[] {left + 1 , right + 1};
            }
            else if(sum < target)
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return new int[] {-1,-1};
        
    }
}