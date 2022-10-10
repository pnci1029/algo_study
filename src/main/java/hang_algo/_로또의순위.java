//import java.util.*;
//
//class solution {
//    public int[] solution(int[] lottos, int[] win_nums) {
//        // 0 개수 / 같은 수  변수지정
//        int []answer = new int [2];
//        int zero_cout = 0;
//        int match_count = 0;
//
//        int max_result = 0;
//        int min_result = 0;
//
//        for (int i = 0; i < lottos.length; i++){
//            if (lottos[i] == 0) {
//                zero_cout++;
//            }
//            for (int j = 0; j < lottos.length; j++) {
//                if(lottos[i] == win_nums[j]){
//                    match_count++;
//                }
//            }
//        }
//        if(zero_cout==6){
//            max_result = 7-(match_count+zero_cout);
//            min_result = 7-(match_count+1);
//        } else {
//            max_result = 7-(match_count+zero_cout);
//            min_result = 7-(match_count);
//        }
//        answer[0] = max_result;
//        answer[1] = min_result;
//        return answer;
//    }
//}
//
//
//public class main {
//
//    public static void main(String[] args) {
//        int[] lottos = {45, 4, 35, 20, 3, 9};
//        int[] win_numbs = {20, 9, 3, 45, 4, 35};
//        solution sol = new solution();
//
//        sol.solution(lottos,win_numbs);
//    }
//}
