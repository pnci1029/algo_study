//class Solution {
//    public int solution(String t, String p) {
//        int answer = 0;
//
//        int length = p.length();
//        String result = "";
//        String[] split = t.split("");
//        int count = 0;
//        while (true) {
//
//            for (int i = count; i < count +length; i++) {
//                result += split[i];
//            }
//
//            if (Long.parseLong(result) <= Long.parseLong(p)) {
//                answer++;
//            }
//            result = "";
//
//            count++;
//            if (count + length-1 == split.length) {
//                break;
//            }
//        }
//
//
//        return answer;
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//
//        String a = "500220839878";
//        String b = "7";
//
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a, b));
//
//    }
//}
