//class Solution {
//    public String solution(int[] food) {
//        String answer = "";
//        int count = 0;
//
//        for (int i = 0; i < food.length; i++) {
//            count = food[i]/2;
//            for (int j = 0; j < count; j++) {
//                answer += i;
//            }
//        }
//        answer += 0;
//        String[] split = answer.split("");
//        for (int i = split.length-2; i >= 0; i--) {
//            answer += split[i];
//        }
//
//
//        return answer;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        int[] box = {1, 7, 1, 2};
//
//        Solution solution = new Solution();
//        System.out.println(solution.solution(box));
//    }
//}
