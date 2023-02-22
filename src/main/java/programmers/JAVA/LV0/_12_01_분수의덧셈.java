//import java.util.ArrayList;
//import java.util.List;
//
//class Solution {
//    public int[] solution(int denum1, int num1, int denum2, int num2) {
//        int[] answer = new int[2];
//
//        int max = Math.max(num1, num2);
//        int min = Math.min(num1, num2);
//        List<Integer> box = new ArrayList<>();
//        int a = max;
//        int b = min;
//
//        if (min != 1) {
//            while (true) {
//                int count = 1;
//                for (int i = 2; i <= b; i++) {
//                    if (a % i == 0 && b % i == 0) {
//                        box.add(i);
//                        count = i;
//                        break;
//                    }
//                }
//                a /= count;
//                b /= count;
//
//                if (count == 1) {
//                    break;
//                }
//            }
//        }
//
//
//        int sum = 1;
//        for (Integer integer : box) {
//            sum *= integer;
//        }
//
//        if (sum != 0) {
//            answer[1] = sum * a * b;
//        } else {
//            answer[1] = a * b;
//        }
//
//
//        if (num1 == max) {
//            answer[0] = (answer[1] / max * denum1) + (answer[1] / min * denum2);
//        } else {
//            answer[0] = (answer[1] / max * denum2) + (answer[1] / min * denum1);
//
//        }
//        max = Math.max(answer[0], answer[1]);
//        min = Math.min(answer[0], answer[1]);
//
//        sum=0;
//        for (int i = 2; i <= min; i++) {
//            if (max % i == 0 && min % i == 0) {
//                sum = i;
//            }
//        }
//
//
//        if (sum >= 2) {
//            answer[0]/=sum;
//            answer[1]/=sum;
//        }
//
//        return answer;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        int d1 = 1;
//        int n1 = 1;
//        int d2 = 1;
//        int n2 = 1;
//
////        int d1 = 1;
////        int n1 = 27;
////        int d2 = 1;
////        int n2 = 54;
//
//        Solution solution = new Solution();
//        System.out.println(solution.solution(d1, n1, d2, n2));
//    }
//}
