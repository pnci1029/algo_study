class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double result = 0;
        for(int i =0; i<k; i++){
            result += nums[i];
        }

        int idx = 1;
        while(true){
            
            if(idx>nums.length -k)break;
            result = Math.max(result, result -nums[idx-1] + nums[k+idx-1]);
            idx++;
        }

        return result/k;
    }
}
