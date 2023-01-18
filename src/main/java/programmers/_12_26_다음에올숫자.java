//class Solution {
//    public int solution(int[] common) {
//
//        if (common[common.length - 1] - common[common.length - 2] != common[common.length - 2] - common[common.length - 3]) {
//            return common[common.length-1]*((common[common.length - 1] - common[common.length - 2])/ (common[common.length - 2] - common[common.length - 3]));
//        } else {
//            return common[common.length - 1] + (common[common.length - 1] - common[common.length - 2]);
//        }
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//        int[] a = {1, 2, 4, 8};
//
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a));
//
//    }
//}
