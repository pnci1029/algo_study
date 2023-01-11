//import java.util.ArrayList;
//import java.util.List;
//
//class Solution {
//    public List<Long> solution(long[] numbers) {
//
//        List<Long> result = new ArrayList<>();
//        for (long number : numbers) {
//            String target = Long.toBinaryString(number);
//            long compareNumb = number + 1;
//
//
//            while (true) {
//                int count = 0;
////                비교 숫자 변환
//                String[] compareSplits = Long.toBinaryString(compareNumb).split("");
//
//
//                if (target.length() != compareSplits.length) {
//                    target = "0" + Long.toBinaryString(number);
//                }
//
//                String[] targetSplits = target.split("");
//
//
//                for (int i = 0; i < compareSplits.length; i++) {
//                    if (!targetSplits[i].equals(compareSplits[i])) {
//                        count++;
//                    }
//                }
//
//
//                if (count <= 2) {
//                    result.add(compareNumb);
//                    break;
//                }
//                compareNumb++;
//            }
//        }
//
//        return result;
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//
//        long[] a = {2, 7};
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a));
//
//    }
//}
