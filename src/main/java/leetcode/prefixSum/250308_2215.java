v2
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
      Set<Integer> setA = new HashSet<>();
      Set<Integer> setB = new HashSet<>();

      for(int i =0; i<nums1.length; i++){
        setA.add(nums1[i]);
      }

      for(int i =0; i<nums2.length; i++){
        setB.add(nums2[i]);
      }

      List<Integer> boxA = new ArrayList<>();
      List<Integer> boxB = new ArrayList<>();

      for(int value: setA){
        if(!setB.contains(value)){
            boxA.add(value);
        }
      }

      for(int value: setB){
        if(!setA.contains(value)){
            boxB.add(value);
        }
      }

      List<List<Integer>> result = new ArrayList<>();
      result.add(boxA);
      result.add(boxB);
      return result;
    }
}



v1
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();

        Set<Integer> set = new HashSet<>();
        for(int i =0; i<nums1.length; i++){
            left.add(nums1[i]);
            set.add(nums1[i]);
        }

        for(int i =0; i<nums2.length; i++){
            right.add(nums2[i]);
            set.add(nums2[i]);
        }

        // [1,2,3,4,6]
        List<Integer> rightResult = new ArrayList<>();
        List<Integer> leftResult = new ArrayList<>();
        Set<Integer> tempSet = new HashSet<>(set);
        Set<Integer> tempSet2 = new HashSet<>(set);
        tempSet.removeAll(left);
        tempSet2.removeAll(right);

        rightResult.addAll(tempSet);
        leftResult.addAll(tempSet2);
        result.add(leftResult);
        result.add(rightResult);

        return result;
    }
}
