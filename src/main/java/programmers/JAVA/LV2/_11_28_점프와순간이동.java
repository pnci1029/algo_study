//import java.util.*;
//
//class Solution {
//    public int solution(int n) {
//        int ans = 0;
//
//        int numb = n;
//        while (true) {
//
//            if (numb == 2) {
//                ans++;
//                break;
//            }
//            if (numb % 2 == 1) {
//                ans++;
//                numb--;
//            }
//            if (numb == 0) {
//                break;
//            }
//            numb /= 2;
//        }
//
//
//        return ans;
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//        int a =6;
//
//
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a));
//    }
//}
