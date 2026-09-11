class Solution {
    public int mySqrt(int x) {
        	int low = 1 , high = x;
			
			int answer = 0;
			while(low <= high)
			{
				int mid = low + (high - low)/2;
				if((long)mid*mid == x)
				{
					answer = mid;
					return answer;
				}
				else if((long) mid*mid > x)
				{
					high = mid - 1;
				}
				else if((long)mid*mid < x)
				{
					low = mid + 1;
					answer = mid;
				}
		    }
			return answer;
        
    }
}