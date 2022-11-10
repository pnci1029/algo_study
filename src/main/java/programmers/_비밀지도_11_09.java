//import java.util.ArrayList;
//import java.util.List;
//
//class Solution {
//    public String[] solution(int n, int[] arr1, int[] arr2) {
//        String[] answer = new String[n];
//
//        String[] answerbox_01 = new String[n];
//        String[] answerbox_02 = new String[n];
//
//        long[] intbox = new long[n];
//        String[] stringBox = new String[n];
//
//        for (int i = 0; i < arr1.length; i++) {
//            answerbox_01[i] = Long.toBinaryString(arr1[i]);
//            answerbox_02[i] = Long.toBinaryString(arr2[i]);
//
//            intbox[i] = Long.parseLong(answerbox_01[i])+Long.parseLong(answerbox_02[i]);
//            stringBox[i] = String.valueOf(intbox[i]);
//            System.out.println(intbox[i]);
//        }
//
//        for (int i = 0; i < intbox.length; i++) {
//            char[] c = stringBox[i].toCharArray();
//
//            while(stringBox[i].length() <n){
//                stringBox[i] = " " + stringBox[i];
//            }
////            if (stringBox[i].length() < n) {
////                stringBox[i] = " " + stringBox[i];
////            }
//            stringBox[i] = stringBox[i].replace("0", " ");
//            stringBox[i] = stringBox[i].replace("1", "#");
//            stringBox[i] = stringBox[i].replace("2", "#");
//
//
//            System.out.println(stringBox[i]);
//            answer[i] = stringBox[i];
//        }
//
//        return answer;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//
//        int[] box1 = {9, 20, 28, 18, 11};
//        int[] box2 = {30, 1, 21, 17, 28};
//        int a = 5;
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a,box1,box2));
//    }
//}
