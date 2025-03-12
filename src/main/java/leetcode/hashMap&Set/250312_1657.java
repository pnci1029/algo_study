v1
class Solution {
    public boolean closeStrings(String word1, String word2) {
        String []splitA = word1.split("");
        String []splitB = word2.split("");

        Map<String, Integer> boxA = new HashMap<>();
        Map<String, Integer> boxB = new HashMap<>();
        
        int resultA = 0;
        int resultB = 0;

        Set<String> setA = new HashSet<>();
        Set<String> setB = new HashSet<>();

        for(String value : splitA){
            int nums = boxA.getOrDefault(value, 0) +1;
            boxA.put(value, nums);
            resultA += nums;
            setA.add(value);
        }

        for(String value : splitB){
            int nums = boxB.getOrDefault(value, 0) +1;
            boxB.put(value, nums);
            resultB += nums;
            setB.add(value);
        }

        return resultA == resultB && setA.equals(setB);
    }
}
