//import javax.print.DocFlavor;
//import java.util.*;
//
//class Solution {
//    public int[] solution(int n, String[] words) {
//        int[] answer = new int[2];
//        int count = 1;
//        int turn = 1;
//
//
//        HashSet<String> set = new HashSet<>();
//
//        char word = words[0].charAt(0);
//        for (int i = 0; i < words.length; i++) {
//            if (set.contains(words[i]) || words[i].charAt(0) != word) {
//                answer[0] = count;
//                answer[1] = turn;
//                break;
//            }
//            word = words[i].charAt(words[i].length() - 1);
//            set.add(words[i]);
//            count++;
//            if (count > n) {
//                count = 1;
//                turn++;
//            }
//        }
//
//        System.out.println(answer[0]);
//        System.out.println(answer[1]);
//        return answer;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
////        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
//
//        int n = 3;
//        Solution solution = new Solution();
//        System.out.println(Arrays.toString(solution.solution(n, words)));
//    }
//}
