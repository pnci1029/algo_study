//class Solution {
//    public String[] solution(String[] quiz) {
//        String[] answer = new String[quiz.length];
//
//        for (int a = 0; a < quiz.length; a++) {
//            String[] s1 = quiz[a].split(" ");
//            for (int i = 0; i < s1.length; i++) {
//                if (s1[1].equals("+")) {
//                    if (Integer.parseInt(s1[0]) + Integer.parseInt(s1[2]) == Integer.parseInt(s1[4])) {
//                        answer[a] = "O";
//                    } else {
//                        answer[a] = "X";
//                    }
//
//                }
//                if (s1[1].equals("-")) {
//                    if (Integer.parseInt(s1[0]) - Integer.parseInt(s1[2]) == Integer.parseInt(s1[4])) {
//                        answer[a] = "O";
//                    } else {
//                        answer[a] = "X";
//                    }
//                }
//            }
//        }
//
//        return answer;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
////        String[] box = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
////        String[] box = {"3 - 4 = -3", "5 + 6 = 11"};
//        String[] box = {"3 + 2 = 5", "10000 + 20000 = 30000"};
//
//
//        Solution solution = new Solution();
//        System.out.println(solution.solution(box));
//    }
//}
