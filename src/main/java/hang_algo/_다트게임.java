//import java.util.*;
//class Solution {
//    public int solution(String dartResult) {
//        int[] box = new int[3];
//        int answer = 0;
//        String index = "";
//        int toInt= 0;
//        int indx = 0;
////                                                  1D2S#10S
//        for (int i = 0; i < dartResult.length(); i++) {
//            char spl = dartResult.charAt(i);
//
//
//            if (spl >= '0' && spl <= '9') {
//                index += String.valueOf(spl);
//            }
//
//
//            else if (spl == 'D' || spl == 'S' || spl == 'T') {
//                toInt = Integer.parseInt(index);
//                if (spl == 'S') {
//                    box[indx++] = toInt;
//                } else if (spl == 'D') {
//                    box[indx++] = toInt*toInt;
//                } else if (spl == 'T') {
//                    box[indx++] = toInt*toInt*toInt;
//                }
//                index = "";
//            }
//
//            else {
//                if(spl=='*'){
//                    box[indx-1]*=2;
//                    if(indx-2>=0) box[indx-2]*=2;
//                }
//                else {
//                    box[indx-1]*=(-1);
//                }
//            }
//        }
//
//        System.out.println(box[0]);
//        System.out.println(box[1]);
//        System.out.println(box[2]);
//        answer=box[0]+box[1]+box[2];
//
//
//        System.out.println("정답은");
//        return answer;
//    }
//}
//
//public class main {
//
//    public static void main(String[] args) {
//        String dartResult = "1D*2S#10T";
//        Solution sol = new Solution();
//        System.out.println(sol.solution(dartResult));
//
//    }
//}
