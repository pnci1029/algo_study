//import java.util.*;
//
//class Solution {
//    public int solution(int k, int m, int[] score) {
//        Arrays.sort(score);
//
//        Stack<Integer> box = new Stack<>();
//        for (int i : score) {
//            box.add(i);
//        }
//
//
//        List<List<Integer>> finBox = new ArrayList<>();
//
//        List<Integer> numbBox = new ArrayList<>();
//        for (int i = 0; i < score.length; i++) {
//            numbBox.add(box.peek());
//            if (numbBox.size() == m) {
//                finBox.add(numbBox);
//                numbBox = new ArrayList<>();
//            }
//            box.pop();
//        }
//
//        int result = 0;
//        for (List<Integer> integers : finBox) {
//            Integer target = integers.get(integers.size()-1);
//            result += target * m;
//        }
//
//
//
//        return result;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        int a = 3;
//        int m = 4;
////        int[] box = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
//        int[] box = {1, 2, 3, 1, 2, 3, 1};
//
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a,m,box));
//    }
//}
