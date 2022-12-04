//import java.util.Arrays;
//
//class Solution {
//    public long solution(int n, int k) {
//        long answer = 0;
//
////        boolean[] sosuBox = new boolean[1000000];
////        Arrays.fill(sosuBox, true);
////
////        sosuBox[0] = sosuBox[1] = false;
////        for (int i = 2; i * i < sosuBox.length; i++) {
////            for (int j = i * i; j < 1000000; j += i) {
////                sosuBox[j] = false;
////            }
////        }
//
//        String value = Long.toString(n, k);
//        while (true) {
//            int zeroCount = 0;
//            if (value.contains("00")) {
//                value = value.replace("00", "0");
//                zeroCount++;
//            }
//            if (zeroCount == 0) {
//                break;
//            }
//        }
//
//        String[] split = value.split("0");
//
//
//        for (String s : split) {
//            if (isPrime(Long.parseLong(s))) {
//                answer++;
//            }
//        }
//        return answer;
//    }
//
//    public boolean isPrime(long num) {
//        if (num == 1 || num == 0) {
//            return false;
//        }
//
//        int sqrt = (int) Math.sqrt(num);
//        for (int i = 2; i <= sqrt; i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        int b = 437674;
//        int a = 3;
//        Solution solution = new Solution();
//        System.out.println(solution.solution(b, a));
//    }
//}
