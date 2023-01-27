//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//class Solution {
//    public List<Integer> solution(int[] order) {
//        List<Integer> answer = new ArrayList<>();
//        int[] stuA = new int[10001];
//        int[] stuB = new int[10001];
//        int[] stuC = new int[10001];
//        int[] resultBox = new int[10001];
//
//        stuA[0] = 0;
//        stuB[0] = 0;
//        stuC[0] = 0;
//        resultBox[0] = 0;
//
////        stu1
//        for (int i = 1; i <= 10000; i++) {
//            int result = i % 5;
//
//            if (result == 1) {
//                stuA[i] = 1;
//            } else if (result == 2) {
//                stuA[i] = 2;
//            } else if (result == 3) {
//                stuA[i] = 3;
//            } else if (result == 4) {
//                stuA[i] = 4;
//            } else {
//                stuA[i] = 5;
//            }
//        }
//
////        stu2
//        for (int i = 1; i <= 10000; i++) {
//            int result = i % 8;
//
//            if (result % 2 != 0) {
//                stuB[i] = 2;
//            }
//            if (result == 2) {
//                stuB[i] = 1;
//            }
//            if (result == 4) {
//                stuB[i] = 3;
//            }
//            if (result == 6) {
//                stuB[i] = 4;
//            }
//            if (result == 0) {
//                stuB[i] = 5;
//            }
//
//        }
//
////        stu3
//        for (int i = 1; i <= 10000; i++) {
//            int result = i % 10;
//
//            if (result == 1) {
//                stuC[i] = 3;
//            } else if (result == 2) {
//                stuC[i] = 3;
//            } else if (result == 3) {
//                stuC[i] = 1;
//            } else if (result == 4) {
//                stuC[i] = 1;
//            } else if (result == 5) {
//                stuC[i] = 2;
//            } else if (result == 6) {
//                stuC[i] = 2;
//            } else if (result == 7) {
//                stuC[i] = 4;
//            } else if (result == 8) {
//                stuC[i] = 4;
//            } else if (result == 9) {
//                stuC[i] = 5;
//            } else {
//                stuC[i] = 5;
//            }
//        }
//
//        int stuAPoint = 0;
//        int stuBPoint = 0;
//        int stuCPoint = 0;
//        for (int i = 1; i <= order.length; i++) {
//            resultBox[i] = order[i - 1];
//            if (resultBox[i] == stuA[i]) {
//                stuAPoint++;
//            }
//            if (resultBox[i] == stuB[i]) {
//                stuBPoint++;
//            }
//            if (resultBox[i] == stuC[i]) {
//                stuCPoint++;
//            }
//        }
//        int max = Math.max(stuAPoint, Math.max(stuBPoint, stuCPoint));
//
//        if (stuAPoint == max) {
//            answer.add(1);
//        }
//        if (stuBPoint == max) {
//            answer.add(2);
//        }
//        if (stuCPoint == max) {
//            answer.add(3);
//        }
//
//        return answer;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
////        int[] a = {1,2,3,4,5};
//        int[] a = {1, 3, 2, 4, 2};
////        int[] a = {5, 5, 4, 2, 3};
//
//
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a));
//    }
//}
