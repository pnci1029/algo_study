//import java.util.ArrayList;
//
//class Solution {
//    public int solution(int n) {
//        int answer = 0;
//
//        int result = 0;
//        ArrayList<Integer> result_box = new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//            for (int j = i; j <= n; j++) {
//                result += j;
//                if (result == n) {
//                    result_box.add(j);
//                } else if (result > n) {
//                    break;
//                }
//            }
//            result = 0;
//        }
//        return result_box.size();
//    }
//}