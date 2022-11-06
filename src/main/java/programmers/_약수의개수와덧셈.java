//import java.util.ArrayList;
//
//class Solution {
//    public int solution(int left, int right) {
//        int answer = 0;
//
//        ArrayList<Integer> result_box = new ArrayList<>();
//        for (int i = 0; i < right - left+1; i++) {
//            result_box.add(left+i);
//        }
//        System.out.println(result_box);
//        ArrayList<Integer> zzak_result = new ArrayList<>();
//        int[] zzak_count = new int[result_box.size()];
//
//        for (int i = 0; i < result_box.size(); i++) {
//            for (int j = 1; j <= result_box.get(i); j++) {
//                if (result_box.get(i) % j == 0) {
//                    zzak_count[i]++;
//                }
//            }
//            zzak_result.add(zzak_count[i]);
//        }
//
//        int arr_result = 0;
//        ArrayList<Integer> arr = new ArrayList<>();
//
//        for (int i = 0; i < zzak_result.size(); i++) {
//            if (zzak_result.get(i) %2 ==0) {
//                arr_result = result_box.get(i);
//                arr.add(arr_result);
//            } else if (zzak_result.get(i) %2 !=0) {
//                arr_result = -(result_box.get(i));
//                arr.add(arr_result);
//            }
//        }
//        int  result = 0;
//        for (int i = 0; i < arr.size(); i++) {
//            result += arr.get(i);
//        }answer = result;
//
//
//        return answer;
//    }
//}
//
//public class main {
//    public static void main(String[] args) {
//        Solution sol = new Solution();
//        sol.solution(13, 17);
//
//        System.out.println(sol.solution(24, 27));
//
//
//    }
//}
