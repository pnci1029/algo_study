//import java.util.*;
//class Solution {
//    public int[] solution(int N, int[] stages) {
//        int[] answer = {};
//        int[] stages_sort = new int[stages.length];
//        double box_size = stages.length;
//
//        ArrayList<Integer> number_box = new ArrayList<>();
//
//        double[] total = new double[501];
////        stage소트 1 2 2 2 3 3 4 6
//        for (int i = 0; i < stages.length; i++) {
//            stages_sort[i] = stages[i];
//        }
//        Arrays.sort(stages_sort);
//        int max_numb = stages_sort[stages_sort.length-1];
//
//        HashSet<Integer> stages_hash = new HashSet<>();
//
////        stage해쉬 1 2 3 4 6
//        for (int i = 0; i < stages.length; i++) {
//            stages_hash.add(stages_sort[i]);
//        }
//
//        for (int sort : stages_sort) {
//            for (int hash : stages_hash) {
//                if (hash == sort) {
//                    total[hash]++;
//                }
//            }
//        }
//
//        double result = 0;
//        double[] result_box = new double[N];
//        for (int i = 0; i < result_box.length; i++) {
//
//            result_box[i]=total[i] / box_size;
//            box_size -= total[i];
////                System.out.println(i+"+"+result_box[i]);
////                System.out.println(box_size);
//
//        }
//        Arrays.sort(result_box);
//        System.out.println(result_box[0]);
//
//
//
//        return answer;
//    }
//}
//
//public class main {
//
//    public static void main(String[] args) {
//        int N = 5;
//        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
//        Solution sol = new Solution();
//        System.out.println(sol.solution(N, stages));
//
//    }
//}
