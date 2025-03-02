class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int zeroCount = 0;
        int maxLength = 0;
        
        while (right < nums.length) {
            if (nums[right] == 0) {
                zeroCount++;
            }
            
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            
            maxLength = Math.max(maxLength, right - left + 1);
            
            right++;
        }
        
        return maxLength;
    }
}
