//
//class Solution {
//    public int solution(int n, int[] lost, int[] reserve) {
//        int answer = 0;
//        int[] student = new int[n + 2];
//
//        for (int i = 0; i < reserve.length; i++) {
//            student[reserve[i]]++;
//        }
//        System.out.println(student[3]);
//
//        for (int i = 0; i < lost.length; i++) {
//            student[lost[i]]--;
////            stuendent
//        }
//
//        for (int i = 1; i <=n; i++) {
//            if (student[i] == 1) {
//                if (student[i - 1] == -1) {
//                    student[i - 1]++;
//                    student[i]--;
//                } else if (student[i + 1] == -1) {
//                    student[i + 1]++;
//                    student[i]--;
//                }
//            }
//        }
//
//        for (int i = 1; i <=n; i++) {
//            if (student[i] >= 0) {
//                answer++;
//            }
//        }
//
//        return answer;
//    }
//}
//
////     0 1 2 3 4 5 6
////       1
//public class main {
//    public static void main(String[] args) {
//        int n = 5;
//        int[] lost = {1,3,5};
//        int[] reverse = {2,4,5};
//        Solution sol = new Solution();
//        int reuslt = sol.solution(n,lost,reverse);
//        System.out.println("답은: "+reuslt);
//
//
//    }
//}
