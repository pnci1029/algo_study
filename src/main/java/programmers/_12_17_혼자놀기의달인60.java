//import java.util.*;
//
//class Solution {
//    public int solution(int[] cards) {
//        int answer = 1;
//
//        List<Integer> card = new ArrayList<>();
//        for (int i : cards) {
//            card.add(i);
//        }
//
//        List<Integer> total = new ArrayList<>();
//        int count = 0;
//        Map<Integer, List<Integer>> map = new HashMap<>();
//        while (true) {
//
//            boolean isContain = false;
//
//            List<Integer> box = new ArrayList<>();
//            int numb = card.get(count);
//            box.add(numb);
//            if (!total.contains(numb)) {
//                isContain = true;
//                while (true) {
//                    numb = card.get(numb - 1);
//                    if (box.contains(numb)) {
//                        break;
//                    }
//                    box.add(numb);
//                    total.add(numb);
//                }
//            } else {
//                break;
//            }
//
//            map.put(count, box);
//            count++;
//            if (count == cards.length) {
//                break;
//            }
//        }
//
//        System.out.println("map = " + map);
//        if (map.size() <= 1) {
//            return 0;
//        } else {
//
////            List<Integer> result = new ArrayList<>();
////            for (int i = 0; i < map.size()-1; i++) {
////                result.add(map.get(i).size() * map.get(i + 1).size());
////            }
////            Collections.sort(result);
////            answer = result.get(result.size() - 1);
//
//
//            int max = 0;
//            int key = 0;
//            for (Integer integer : map.keySet()) {
//                if (map.get(integer).size() > max) {
//                    max = map.get(integer).size();
//                    key = integer;
//                }
//            }
//            answer *= max;
//            map.remove(key);
//            if (max == cards.length) {
//                return 0;
//            }
//            max = 0;
//            key = 0;
//            for (Integer integer : map.keySet()) {
//                if (map.get(integer).size() > max) {
//                    max = map.get(integer).size();
//                    key = integer;
//                }
//            }
//            answer *= max;
//
//        }
//
//        return answer;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
////        int[] a = {8,6,3,7,2,5,1,4};
////        int[] a = {5, 3, 2, 1, 4};
////        int[] a = {1, 2};
////        int[] a = {2, 3, 1};
//        int[] a = {10, 5, 6, 7, 8, 9, 1, 2, 3, 4};
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a));
//
//    }
//}
