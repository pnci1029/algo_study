//class Solution {
//    public int solution(int[][] sizes) {
//        int answer = 0;
//        int big = 0;
//        int small = 0;
//        int[] bigOne = new int[sizes.length];
//        int[] smallOne = new int[sizes.length];
//
//        for (int i = 0; i < sizes.length; i++) {
//            if (sizes[i][0] > sizes[i][1]) {
//                bigOne[i] = sizes[i][0];
//                smallOne[i] = sizes[i][1];
//            } else if (sizes[i][0] < sizes[i][1]) {
//                bigOne[i] = sizes[i][1];
//                smallOne[i] = sizes[i][0];
//
//            } else{
//                bigOne[i] = sizes[i][0];
//                smallOne[i] = sizes[i][1];
//            }
//        }
//        for (int i = 0; i < bigOne.length; i++) {
//            if (bigOne[i] >= big) {
//                big = bigOne[i];
//            } else{
//                big = big;
//            }
//            if (smallOne[i] >= small) {
//                small = smallOne[i];
//            } else {
//                small = small;
//            }
//        }
//        answer = big * small;
//        return answer;
//    }
//}
//
//public class main {
//
//    public static void main(String[] args) {
//        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
//
//        Solution sol = new Solution();
//        System.out.println(sol.solution(sizes));
//
//    }
//}
