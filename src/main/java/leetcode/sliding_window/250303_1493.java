// 1 1 0 1 1 1 0 1 1 1 1 
//V1
class Solution {
    public int longestSubarray(int[] nums) {
        int result = 0;
        int maxValue = 0;

        int left = 0;
        int right = 0;
        boolean isCount = false;
        int oneCount = 0;
        for(int i =0; i<nums.length; i++){
            if(nums[i] == 1){
                oneCount++;
            }
        }
        if(oneCount == nums.length) return nums.length -1;

        while (true) {
            if (nums[left] == 1) {
                result++;
            }
            System.out.println("left : " + left);
            System.out.println("result : " + result);
            // 1 1 0 1 1 1 0 1 1 1 1 
            if (nums[left] == 0) {
                if (isCount) {
                    maxValue = Math.max(maxValue, result);
                    result = left - 1 - right;
                }else {
                    isCount = true;
                }
                // isCount = !isCount;
                right = left;
            }
            left++;
            if (left == nums.length) break;
        }
        maxValue = Math.max(maxValue, result);


        return maxValue;
    }
}
