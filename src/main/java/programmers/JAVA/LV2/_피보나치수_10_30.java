//import java.util.ArrayList;
//import java.util.List;
//
//class Solution {
//    public int solution(int n) {
//        int answer = 0;
//
//
//        List<Integer> box = new ArrayList<>();
//        box.add(0);
//        box.add(1);
//        for (int i = 2; i < n+1; i++) {
//            box.add((box.get(i - 2) + box.get(i - 1)) % 1234567);
//        }
//        answer = box.get(box.size() - 1);
//        return answer;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//
//        int n = 5;
//        Solution solution = new Solution();
//        System.out.println(solution.solution(n));
//    }
//}
