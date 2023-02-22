//class Solution {
//    public int solution(String[] babbling) {
//        int answer = 0;
//
//        for (String s : babbling) {
//            if (!s.contains("ayaaya")&&s.contains("aya")) {
//                s = s.replace("aya", "1");
//            }
//            if (!s.contains("yeye")&&s.contains("ye")) {
//                s = s.replace("ye", "1");
//            }
//            if (!s.contains("mama")&&s.contains("ma")) {
//                s = s.replace("ma", "1");
//            }
//            if (!s.contains("woowoo")&&s.contains("woo")) {
//                s = s.replace("woo", "1");
//            }
//            if (s.contains("1")) {
//                s = s.replace("1", "");
//            }
//            if (s.equals("")) {
//                answer++;
//            }
//        }
//
//        return answer;
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//
//        String[] box = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa","ymae","wooyemawooye"};
//
//        Solution solution = new Solution();
//        System.out.println(solution.solution(box));
//    }
//}
