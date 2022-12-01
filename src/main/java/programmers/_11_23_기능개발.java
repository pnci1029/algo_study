//import java.util.*;
//
//class Solution {
//    public List<Integer> solution(int[] progresses, int[] speeds) {
//        List<Integer> answer = new ArrayList<>();
//        List<Integer> box = new ArrayList<>();
//        List<Integer> numbBox = new ArrayList<>();
//        Stack<Integer> stack = new Stack<>();
//
//        ;
//        for (int i = 0; i < progresses.length; i++) {
//            stack.add(progresses[i]);
//            box.add(progresses[i]);
//            numbBox.add(speeds[i]);
//        }
//
//
//        int point = 0;
//        int compare = 0;
//        while (true) {
//            for (int i = point; i < stack.size(); i++) {
//                stack.set(i, stack.get(i) + numbBox.get(i));
//                if (stack.get(point) >= 100) {
//                    point++;
//                }
//            }
//            if (point != compare) {
//                answer.add(point - compare);
//                compare = point;
//            }
//
//            if (point == stack.size()) {
//                break;
//            }
////            if (stack.size()==0) {
////
////            }
//        }
//
//
////        while (true) {
////            int count = 0;
////            for (int i = 0; i < box.size(); i++) {
////                box.set(i, box.get(i) + numbBox.get(i));
////                if (box.get(0) >= 100) {
////                    if (box.size() == 2) {
////                        if (box.get(1) >= 100) {
////                            box.remove(1);
////                            box.remove(0);
////                            count += 2;
////                            break;
////                        }
////                    }
////                    box.remove(0);
////                    numbBox.remove(0);
////                    count++;
////                }
////            }
////            if (count != 0) {
////                answer.add(count);
////            }
////            if (box.isEmpty()) {
////                break;
////            }
////        }
//        return answer;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        int[] a = {95, 90, 99, 99, 80, 99};
//        int[] b = {1, 1, 1, 1, 1, 1};
////        int[] a = {93, 30, 55};
////        int[]b = {1, 30,5};
//
//
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a, b));
//    }
//}
