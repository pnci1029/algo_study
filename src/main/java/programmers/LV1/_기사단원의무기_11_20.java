//class Solution {
//    public int solution(int number, int limit, int power) {
//        int answer = 0;
//        int[] box = new int[number+1];
//
//        box[0] = 0;
//        for (int i = 1; i <= number; i++) {
//            for (int j = 1; j <= (Math.sqrt(i)); j++) {
//                if (i % j == 0) {
//                    box[i] += 1;
//                    if (i / j != j) {
//                        box[i] += 1;
//                    }
//                }
//            }
//        }
//
//        for (int i = 1; i < box.length; i++) {
//            if (box[i] > limit) {
//                box[i] = power;
//            }
//            answer += box[i];
//        }
//
//        return answer;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        int a= 10;
//        int b = 3;
//        int c = 2;
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a,b,c));
//    }
//}
