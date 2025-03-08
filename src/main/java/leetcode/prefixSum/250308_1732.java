class Solution {
    public int largestAltitude(int[] gain) {
        int [] box = new int[gain.length -1];

        int value = 0;
        int maxValue = 0;
        for(int i =0; i< gain.length; i++){
            value += gain[i];
            maxValue = Math.max(maxValue, value);

        }

        return maxValue;
    }
}
