class Solution {
    public int maxOperations(int[] nums, int k) {
        
        if(nums.length ==0){
            return 0;
        }
        Arrays.sort(nums);

        int first = 0;
        int last = nums.length - 1;
        List<Integer> box = new ArrayList<>();
        System.out.println(Arrays.toString(nums));

        while(true){
            if(first>=last)break;
            System.out.println("first : " + first);
            System.out.println("last : " + last);

            if(nums[first] + nums[last] == k){
                box.add(first);
                box.add(last);
                first++;
                last--;
            }else {
                if(nums[first] + nums[last] >k){
                    last--;
                }else{
                    first++;
                }
            }
        }
        System.out.println(box);

        return box.size()/2;
    }
}
