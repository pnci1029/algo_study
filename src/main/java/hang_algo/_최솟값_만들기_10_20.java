//import java.util.Arrays;
//
//class Solution {
//    public int solution(int[] A, int[] B) {
//
//        int answer = 0;
//        Arrays.sort(A);
//        Arrays.sort(B);
//
//        for (int i = 0; i < A.length; i++) {
//            answer += A[i] * B[A.length -i-1];
//        }
//
//        return answer;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        int[] box1 = {1, 4, 2};
//        int[] box2 = {5, 4, 4};
//        Solution solution = new Solution();
//        System.out.println(solution.solution(box1, box2));
//    }
//}
