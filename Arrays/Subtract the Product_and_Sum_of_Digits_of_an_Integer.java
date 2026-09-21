class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int multiple = 1;

        while(n > 0)
        {
            sum += (n%10);
            multiple *= (n%10);
            n /= 10;
        }
        return multiple - sum;
        
        
    }
}