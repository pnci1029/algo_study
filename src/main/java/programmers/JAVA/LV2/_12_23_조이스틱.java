//import java.util.Arrays;
//
//class Solution {
//    public int solution(String name) {
//        int answer = 0;
//
//        char[] chars = name.toCharArray();
//        boolean[] box = new boolean[chars.length];
//
//        int move = name.length()-1;
//        for (int i = 0; i < name.length(); i++) {
//            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);
//
//            int idx = i+1;
//            while (idx < name.length() && name.charAt(idx) == 'A') {
//                idx++;
//            }
//            move = Math.min(move,i+i+name.length()- idx);
////            System.out.println("i = " + i);
////            System.out.println("idx = " + idx);
//        }
////        System.out.println("move = " + move);
////        if (chars[0] <= 77) {
////            answer += chars[0] - 65;
////            box[0] = true;
////        } else {
////            answer += 91 - chars[0];
////            box[0] = true;
////        }
//
//
//
//
////        if (chars[1] == 'A') {
////            if (chars.length > 2) {
////                for (int i = chars.length - 1; i >= 2; i--) {
////                    answer++;
////                    if (chars[i] <= 77) {
////                        answer += chars[i] - 65;
////                        box[i] = true;
////                    } else {
////                        answer += 91 - chars[i];
////                        box[i] = true;
////                    }
////                    System.out.println("chars[i] = " + chars[i]);
////                    System.out.println("i = " + i);
////                    System.out.println("answer = " + answer);
////                }
////            }
////        } else if (chars[chars.length - 1] == 'A') {
////            answer++;
////            for (int i = 1; i < chars.length - 1; i++) {
////                answer++;
////                if (chars[i] <= 77) {
////                    answer += chars[i] - 65;
////                    box[i] = true;
////                } else {
////                    answer += 91 - chars[i];
////                    box[i] = true;
////                }
////            }
////        } else {
////            for (int i = 1; i < chars.length; i++) {
////                answer++;
////                if (chars[i] <= 77) {
////                    answer += chars[i] - 65;
////                    box[i] = true;
////                } else {
////                    answer += 91 - chars[i];
////                    box[i] = true;
////                }
////            }
////        }
//        System.out.println(Arrays.toString(box));
//
//        return answer+move;
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//
//        String a = "JEROEN";
////        String a = "JAN";
////        String a = "AABAAAAABBB";
//
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a));
//
//    }
//}
