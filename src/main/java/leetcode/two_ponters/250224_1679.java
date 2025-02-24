class Solution {
    public int maxOperations(int[] nums, int k) {
        
        if(nums.length ==0){
            return 0;
        }
        Arrays.sort(nums);

        int first = 0;
        int last = nums.length - 1;
        int count = 0;

        while(first < last){
            int sum = nums[first] + nums[last];
            if(sum == k){
                first++;
                last--;
                count++;
            }else {
                if(sum >k){
                    last--;
                }else{
                    first++;
                }
            }
        }

        return count;
    }
}
