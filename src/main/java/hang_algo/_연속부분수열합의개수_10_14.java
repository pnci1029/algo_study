//import java.util.*;
//
//class Solution {
//    public int solution(int[] elements) {
//
//        Set<Integer> setBox = new HashSet<>();
//        int a = 1;
//        while (a < elements.length) {
//            for (int j = 0; j < elements.length; j++) {
//                int result = 0;
//                for (int k = j; k < j + a; k++) {
//                    result += elements[k % elements.length];
//                }
//                setBox.add(result);
//            }
//            a++;
//        }
//
//        int sum = 0;
//        for (int i = 0; i < elements.length; i++) {
//            sum += elements[i];
//
//            setBox.add(sum);
//
//        }
//
//        int answer = setBox.size();
//        return answer;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        int[] element = {7, 9, 1, 1, 4};
//        Solution solution = new Solution();
//        System.out.println(solution.solution(element));
//
//    }
//}
