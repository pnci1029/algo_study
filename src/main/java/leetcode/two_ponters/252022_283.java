class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> box = new ArrayList<>();
        List<Integer> zeroBox = new ArrayList<>();

        for(int i = 0;i <nums.length; i++){
            if(nums[i] == 0){
                zeroBox.add(nums[i]);
            }else {
                box.add(nums[i]);
            }
        }
        box.addAll(zeroBox);

        for(int i = 0;i <nums.length; i++){
            nums[i] = box.get(i);
        }


    }
}
