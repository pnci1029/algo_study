//import java.util.ArrayList;
//import java.util.List;
//
//class Solution {
//    public List<Integer> solution(int[] arr) {
//        int[] answer = new int[arr.length-1];
//
//        int count = arr[0];
//        List<Integer> box = new ArrayList<>();
//        box.add(count);
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != count) {
//                box.add(arr[i]);
//                count = arr[i];
//            }
//        }
//        return box;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
////        int[] box = {1, 1, 3, 3, 0, 1, 1};
////        int[] box = {4, 4, 4, 3, 3};
//        int[] box = {1, 2,3,4,5};
//
//        Solution solution = new Solution();
//        System.out.println(solution.solution(box));
//    }
//}
