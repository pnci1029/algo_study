//import java.util.*;
//
//class Solution {
//    public int solution(int[] cards) {
//        int answer = 1;
//
//        boolean[] isOpened = new boolean[cards.length];
//        List<Integer> numbBox = new ArrayList<>();
//
//        for (int i = 0; i < isOpened.length; i++) {
//            if (!isOpened[i]) {
//                List<Integer> box = new ArrayList<>();
//                int idx = cards[i];
//                box.add(idx);
//                isOpened[i] = true;
//                if (!isOpened[idx - 1]) {
//                    while (true) {
//                        isOpened[idx - 1] = true;
//                        idx = cards[idx-1];
//                        box.add(idx);
//                        if (isOpened[idx - 1]) {
//                            break;
//                        }
//                    }
//                }
//                numbBox.add(box.size());
//            }
//
//
//        }
//        Collections.sort(numbBox);
//        if (numbBox.size() <= 1) {
//            return 0;
//        } else {
//            answer = numbBox.get(numbBox.size() - 1) * numbBox.get(numbBox.size() - 2);
//        }
//        return answer;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
////        int[] a = {5, 3, 2, 1, 4};
////        int[] a = {2, 3, 1};
////        int[] a = {8,6,3,7,2,5,1,4};
//        int[] a = {1, 2};
////        int[] a = {10, 5, 6, 7, 8, 9, 1, 2, 3, 4};
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a));
//
//    }
//}
