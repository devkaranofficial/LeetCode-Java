class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] answers = new int[nums.length];
        int left_product = 1;
        int right_product = 1;
        for(int i = 0; i < nums.length; i++) {
            answers[i] = left_product;
            left_product *= nums[i];
        }
        for(int i = nums.length - 1; i >= 0; i--) {
            answers[i] *= right_product;
            right_product *= nums[i];
        }
        return answers;
        
    }
}