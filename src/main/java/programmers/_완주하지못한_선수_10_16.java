//import java.util.*;
//
//class Solution {
//    public String solution(String[] participant, String[] completion) {
//        String answer = "";
//
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//
//        for (int i = 0; i < participant.length-1; i++) {
//            if (!participant[i].equals(completion[i])) {
//                answer = participant[i];
//                break;
//            } else {
//                answer = participant[participant.length-1];
//            }
//        }
//
//        return answer;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
//        String[] completion = {"josipa", "filipa", "marina", "nikola"};
//        Solution solution = new Solution();
//        System.out.println(solution.solution(participant,completion));
//
//    }
//}
