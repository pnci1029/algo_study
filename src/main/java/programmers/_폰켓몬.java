//import java.util.*;
//class Solution {
//    public int solution(int[] nums) {
//        int answer = 0;
//        int max_size = nums.length/2;
//
//
//        HashSet<Integer> po_box = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            po_box.add(nums[i]);
//        }
////        System.out.println(po_box);
////        System.out.println(max_size);
//
//        if (po_box.size() >= max_size) {
//            answer = max_size;
//        } else if (po_box.size() < max_size) {
//            answer = po_box.size();
//        }
//
//
//        return answer;
//    }
//}
//
//public class main {
//
//    public static void main(String[] args) {
//        int[] nums = {3,3,3,2,2,4};
//        Solution sol = new Solution();
//        System.out.println(sol.solution(nums));
//
//    }
//}
