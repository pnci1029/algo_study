//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//class Solution {
//    public int[] solution(String s) {
//        int[] answer = new int[s.length()];
//
//        String[] split = s.split("");
//        List<String> box = new ArrayList<>();
//
//        for (int i = 0; i < answer.length; i++) {
//            if (box.contains(split[i])) {
//                int count = 0;
//                for (int j = 0; j < box.size(); j++) {
//                    if (box.get(j).equals(split[i])) {
//                        count = j;
//                    }
//                }
//                answer[i] = box.size()-count;
//            } else {
//                answer[i] = -1;
//            }
//            box.add(split[i]);
//        }
//
//        return answer;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        String a = "foobar";
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a));
//
//    }
//}
