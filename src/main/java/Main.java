//
//class Solution {
//    int solution(int[][] land) {
//        int answer = 0;
//
//        int numb = -1;
//        for (int i = 0; i < land.length; i++) {
//            int max = 0;
//            int returnNumb = 0;
//            for (int j = 0; j < land[i].length; j++) {
//                if (land[i][j] > max && numb !=j) {
//                    max = land[i][j];
//                    returnNumb = j;
//                }
//            }
//            answer += max;
//            numb = returnNumb;
//        }
//
//        return answer;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        int a = 10;
//        int b = 10;
//
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a,b));
//    }
//}
