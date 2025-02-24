class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double currentValue = 0;
        for(int i =0; i<k; i++){
            currentValue += nums[i];
        }
        double result = currentValue;

        for(int i =k; i<nums.length; i++){
            currentValue = currentValue - nums[i-k] + nums[i];
            result = Math.max(result, currentValue);
        }

        return result/k;
    }
}
