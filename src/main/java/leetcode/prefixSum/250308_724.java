v1
  class Solution {
    public int pivotIndex(int[] nums) {
        int currentIdx = 0;
        int result = -1;

        while(true){
            
            if(currentIdx == nums.length) break;
            int leftSum = 0;
            int rightSum = 0;
            for(int i =0; i<nums.length; i++){
                if(i<currentIdx){
                    leftSum += nums[i];
                }
                if(i>currentIdx){
                    rightSum += nums[i];
                }
            }
            if(leftSum == rightSum){
                result = currentIdx;
                break;
            }
            currentIdx++;
        }

        return result;
    }
}
