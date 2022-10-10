//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//// 달팽이 구하기
//class Solution {
//    public long solution(long n) {
//        List<Long> arr = new ArrayList<Long>();
//        long result = 0;
//        long answer = 0;
//
//        while (n > 0) {
//            result = n/10;
//            arr.add (n%10);
//            n = result;
//        }
//        long[] box = new long[arr.size()];
//        for (int i = 0; i < arr.size(); i++) {
//            box[i] = arr.get(i);
//        }
//        Arrays.sort(box);
//
//
//        for (int i =box.length-1; i >= 0; i--) {
//            answer = answer+ box[i];
//            answer *= 10;
//        }
//        answer /= 10;
//
//
//        return answer;
//    }
//}