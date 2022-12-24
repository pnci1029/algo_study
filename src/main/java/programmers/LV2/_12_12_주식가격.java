//import java.util.Arrays;
//
//class Solution {
//    public int[] solution(int[] prices) {
//        int[] answer = new int[prices.length];
//        int[] result = new int[prices.length];
//
//        for (int i = 0; i < prices.length; i++) {
//            answer[i] = prices[i];
//        }
//
//        Arrays.fill(result, 0);
//        int target = 1;
//        while (true) {
//            int count = 0;
//            for (int i = target; i < answer.length; i++) {
//                count++;
//                if (answer[target-1] > prices[i]) {
//                    break;
//                }
////                else {
////                    count++;
////                }
//            }
//
//            result[target - 1] = count;
//            target++;
//            if (target == answer.length) {
//                break;
//            }
//        }
//
////        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
////        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
//
//        return result;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 2, 3};
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a));
//
//    }
//}
//