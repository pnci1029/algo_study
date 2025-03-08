class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for(int value: arr){
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        for (int value : map.keySet()) {
            set.add(map.get(value));
        }

        return map.size() == set.size();
    }
}
