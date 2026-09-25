class Solution {
    public int[] plusOne(int[] digits) {
        
        if(digits[digits.length - 1] != 9)
        {
            digits[digits.length - 1]++;
            return digits;
        }
        else
        {
            int right = digits.length - 1;
            while(right >= 0 && digits[right] == 9)
            {
                digits[right] = 0;
                right--;
            }
            if(right == -1)
            {
                int [] result = new int[digits.length + 1];
                result[0] = 1;
                return result;
            }
            else
            {
                digits[right] ++;
                return digits;
            }
        }
        
    }
}