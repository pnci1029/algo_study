//import java.util.*;
//
//class Solution {
//    public int solution(int[][] lines) {
//        int answer = 0;
//        int[] box = new int[201];
//        Arrays.fill(box, 0);
//
//        if (lines[1][0] >= lines[0][1] && lines[2][0] >= lines[1][1]) {
//            return 0;
//        }
//        for (int i = 0; i < lines.length; i++) {
//            int left = lines[i][0] + 100;
//            int right = lines[i][1] + 100;
//            for (int j = left; j < right; j++) {
//                box[j]++;
//            }
//
//        }
//        for (int i : box) {
//            if (i >= 2) {
//                answer++;
//            }
//        }
//
////        System.out.println(Arrays.toString(box));
//
//        return answer;
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//
////        int[][] a = {{0,1},{2,5},{3,9}};
////        int[][] a = {{-1,1},{1,3},{3,9}};
//        int[][] a = {{0, 5}, {3, 9}, {1, 10}};
////        int[][] a = {{-1, 0}, {0, 1}, {1, 2}};
//
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a));
//
//    }
//}
