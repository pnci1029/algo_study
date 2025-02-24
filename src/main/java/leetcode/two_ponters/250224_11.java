class Solution {
    public int maxArea(int[] height) {

        int first = 0;
        int last = height.length -1;
        int result = 0;
        while(true){
            if(first>last) break;

            int width = last - first;
            int heights = (Math.min(height[last], height[first]));
            result = Math.max(result, width * heights);

            if(height[first] > height[last]){
                last--;
            }else{
                first++;
            }
        }

        return result;
    }
}
