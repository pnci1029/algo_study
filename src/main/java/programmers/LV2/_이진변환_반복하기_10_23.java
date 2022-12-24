//class Solution {
//    public int[] solution(String s) {
//        int[] answer = new int[2];
//        String[] split = s.split("");
//
//        int zeroCount = 0;
//        int changeCount = 0;
//
//
//        while (!s.equals("1")) {
//            int oneCount = 0;
//            for (int i = 0; i < s.length(); i++) {
//                if (s.charAt(i) == '0') {
//                    zeroCount++;
//                } else {
//                    oneCount++;
//                }
//            }
//            s = Integer.toBinaryString(oneCount);
//            changeCount++;
//        }
//        answer[0] = changeCount;
//        answer[1] = zeroCount;
//
//        return answer;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        String s = "110010101001";
//        Solution solution = new Solution();
//        System.out.println(solution.solution(s));
//    }
//}
