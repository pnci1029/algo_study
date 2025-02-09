class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxNumber = 0;


        for(int i =0; i< candies.length; i++){
            maxNumber = Math.max(candies[i],maxNumber);
        }

        for(int i =0; i< candies.length; i++){
            if(candies[i] + extraCandies >= maxNumber){
                result.add(true);
            }else {
                result.add(false);
            }
        }
        System.out.println(maxNumber);
        return result;
    }
}
