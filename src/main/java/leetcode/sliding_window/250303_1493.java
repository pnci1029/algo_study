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


// V2
class Solution {
    public int longestSubarray(int[] nums) {
        int maxLength = 0;
        int zeroCount = 0;
        int left = 0;
        
        for (int right = 0; right < nums.length; right++) {
            // 윈도우에 0 추가
            if (nums[right] == 0) {
                zeroCount++;
            }
            
            // 0이 두 개 이상이면 왼쪽 포인터 이동
            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            
            // 윈도우 크기 계산 (하나의 요소는 반드시 삭제해야 하므로 -1)
            maxLength = Math.max(maxLength, right - left);
        }
        
        return maxLength;
    }
}
