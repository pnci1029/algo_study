class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double result = 0;
        for(int i =0; i<k; i++){
            result += nums[i];
        }
        System.out.println("result1111111 = "+result);

        int idx = 1;
        while(true){
            
            if(idx>nums.length -k)break;
            result = Math.max(result, result -nums[idx-1] + nums[k+idx-1]);
            System.out.println(idx);
            System.out.println("result = "+result);
            idx++;
        }

        // for(int i =1; i<nums.length - k; i++){
        //     result = Math.max(result, result -nums[i-1] + nums[k+i]);
        //     System.out.println(k+i);
        //     System.out.println("result = "+result);
        //     System.out.println("k +1 = "+nums[k+i]);
        // }

        return result/k;
    }
}
