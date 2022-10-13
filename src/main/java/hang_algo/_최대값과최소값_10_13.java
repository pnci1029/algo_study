//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//class Solution {
//    public String solution(String s) {
//        String[] split = s.split(" ");
//        List<Integer> box = new ArrayList<>();
//        String answer = "";
//
//        for (String s1 : split) {
//            box.add(Integer.parseInt(s1));
//        }
//        Collections.sort(box);
//
//        answer = box.get(0) + " " + box.get(box.size()-1);
//        System.out.println(answer);
//        return answer;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        String s = "-1 -2 -3 -4";
//        Solution solution = new Solution();
//        System.out.println(solution.solution(s));
//
//    }
//}
