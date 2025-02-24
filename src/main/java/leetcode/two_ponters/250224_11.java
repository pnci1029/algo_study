class Solution {
    public int maxArea(int[] height) {
        
        // int first = height[0];
        // int last = height[height.length -1];

        // System.out.println(first);
        // System.out.println(last);
        int first = 0;
        int last = height.length -1;
        int result = 0;
        while(true){
            if(first>last) break;

            int width = last - first;
            int heights = (Math.min(height[last], height[first]));
            System.out.println("height : " +  heights);
            result = Math.max(result, width * heights);

            if(height[first] > height[last]){
                last--;
            }else{
                first++;
            }
            System.out.println(result);
            
        }

        return result;
    }
}
