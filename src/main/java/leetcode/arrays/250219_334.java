class Solution {
    public boolean increasingTriplet(int[] nums) {
        int length = nums.length;

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i =0; i<length; i++){
            if(nums[i] <=first){
                first = nums[i];
            } else if(nums[i] <= second){
                second = nums[i];
            }else {
                return true;
            }
        }

        return false;
    }
}
