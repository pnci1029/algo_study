//import java.util.*;
//
//class Solution {
//    public int solution(int cacheSize, String[] cities) {
//        int answer = 0;
//        List<String> box = new ArrayList<>();
//
//        if (cacheSize == 0) {
//            for (int i = 0; i < cities.length; i++) {
//                answer += 5;
//            }
//            return answer;
//        }
//
//        for (int i = 0; i < cities.length; i++) {
//            cities[i] = cities[i].toLowerCase();
//            answer += 5;
//            for (int j = 0; j < box.size(); j++) {
//                if (box.get(j).equals(cities[i])) {
//                    box.remove(j);
//                    answer -= 4;
//                    break;
//                }
//
//            }
//            if (box.size() >= cacheSize) {
//
//                box.remove(0);
//            }
//            box.add(cities[i]);
//
//        }
//
//
//        return answer;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        int a =3;
////        String[]b = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
//        String[]b = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
//
//
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a,b));
//    }
//}
