//import java.util.*;
//
//class Solution {
//    public static Scanner scanner = new Scanner(System.in);
//    public List<Integer> solution(int a, int[] speeds) {
//
//        scanner.nextInt();
//
//
//        Map<Integer, Integer> box = new HashMap<>();
//
//        List<Integer> result = new ArrayList<>();
//        for (int speed : speeds) {
//            box.put(speed, box.getOrDefault(speed, 0) + 1);
//        }
//
//        for (int speed : speeds) {
//            if (box.get(speed) == 1) {
//                result.add(speed);
//            }
//        }
//        Collections.sort(result);
//
//
//        return result;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        int a = 5;
//        int[] b = {4, 3, 3, 2, 6};
////        int[] b = {1,2,3,4,5,4,3,2,1,2};
//
//
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a, b));
//    }
//}
