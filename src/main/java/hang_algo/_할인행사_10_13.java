//import java.util.HashMap;
//
//class Solution {
//    public int solution(String[] want, int[] number, String[] discount) {
//        HashMap<String, Integer> box = new HashMap<>();
//
//        for (int i = 0; i < want.length; i++) {
//            box.put(want[i], number[i]);
//        }
//
//        int answer = 0;
//        for (int i = 0; i < discount.length - 10; i++) {
//            if (box.containsKey(discount[i])) {
//                answer++;
//            } else {
//                answer = 0;
//            }
//
//        }
//
//
//        return answer;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        String[] want = {"banana", "apple", "rice", "pork", "pot"};
//        int[] number = {3, 2, 2, 2, 1};
//        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
//
//        Solution solution = new Solution();
//        System.out.println(solution.solution(want, number, discount));
//
//    }
//}
