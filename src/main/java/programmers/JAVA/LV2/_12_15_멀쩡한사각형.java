//import java.util.ArrayList;
//
//class Solution {
//    public long solution(int w, int h) {
//        long answer = 1;
//
//        long result =0;
//        int gong = 0;
//
//        int width = Math.max(w, h);
//        int height = Math.min(w, h);
//        if (width == 1 || height == 1) {
//            answer = 123;
//        }
//
//
//        for (int i = 1; i <= height; i++) {
//            if (width == height) {
//                gong = i;
//                answer = (long) width * height - gong;
//            }
//            else if (width % i == 0 && height % i == 0) {
//
//                gong = i;
//            }
//        }
//        int first =width/gong;
//        int sec = height/gong;
//        if (width != height) {
//            answer = (long) width * height - (long) gong *(first+sec-1);
//        }
//        System.out.println(gong);
//        System.out.println(answer);
//
//        return answer;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        int a = 8;
//        int b = 12;
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a, b));
//
//    }
//}
