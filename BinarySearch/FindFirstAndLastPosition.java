    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int low = 0;
            int high = nums.length - 1;
            int mid;
            int start , end ;
            while(low <= high)
            {
                mid = low + (high - low)/2;
                if(nums[mid] == target)
                {
                    //action
                    start = mid;
                    end = mid;
                    // Checking left
                    int left_low = low;
                    int left_high = mid - 1;
                    while(left_low <= left_high)
                    {
                        int left_mid = left_low + (left_high - left_low)/2;
                        if(nums[left_mid] == target)
                        {
                            start = left_mid;;
                            left_high = left_mid - 1;
                        }
                        else if(nums[left_mid] < target)
                        {
                            left_low = left_mid + 1;
                        }
                    }
                    //Checking Right
                    int right_low = mid + 1;
                    int right_high = high;
                    while(right_low <= right_high)
                    {
                        int right_mid = right_low + (right_high - right_low)/2;
                        if(nums[right_mid] == target)
                        {
                            end = right_mid;
                            right_low = right_mid + 1;
                        }
                        else if(nums[right_mid] > target)
                        {
                            right_high = right_mid - 1;
                        }
                    } 
                    return new int[]{start , end};
                }
                else if(nums[mid] < target)
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid - 1;
                }


            }
            return new int[]{-1,-1};
            
        }
    }
