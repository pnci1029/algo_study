//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//class Solution {
//    public int[] solution(int[] array, int[][] commands) {
//        int[] answer = {};
//
//
//        int[] box = new int[commands.length];
//
//        for (int j = 0; j < commands.length; j++) {
//            ArrayList<Integer> arr = new ArrayList<>();
//
////          커맨드 [0][]번째부터 [][0] 번째까지 숫자들 arr  배열에 입력
//            for (int i = commands[j][0]-1; i < commands[j][1]; i++) {
//                arr.add(array[i]);
//                System.out.println(array[i]);
//            }
//            Collections.sort(arr);
//            System.out.println(arr);
//
//            box[j] = arr.get(commands[j][2]-1);
//
//        }
//
////        box[j][0] = arr.get(0);
////        System.out.println(arr_result);
//        answer  = box;
//
//
//
//        return answer;
//    }
//}
//public class main {
//    public static void main(String[] args) {
//        int[] array = {1, 5, 2, 6, 3, 7, 4};
//        int[][] commands = {{2,5,3}, {4, 4, 1},{1,7,3}};
//        Solution sol = new Solution();
//        sol.solution(array, commands);
//
//
//    }
//}
