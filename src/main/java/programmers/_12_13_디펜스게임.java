//import java.util.PriorityQueue;
//
//class Solution {
//    public int solution(int n, int k, int[] enemy) {
//        int answer = -1;
//        /**
//         * 우선순위 큐에 앞에서부터 큰 수(무적권 사용할 라운드)를 뒤에 담아두고
//         * 작은 수 부터 상대하여 결과값 추출
//         */
//        if (enemy.length > k) {
//            PriorityQueue<Integer> box = new PriorityQueue<>();
//            for (int i = 0; i < enemy.length; i++) {
//                box.add(enemy[i]);
//                answer++;
//                if (box.size() > k) {
//                    n -= box.poll();
//
//                    if (n < 0) {
//                        return answer;
//                    }
//                }
//            }
//
//        } else {
//            return enemy.length;
//        }
//
//
//        return enemy.length;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        int orders = 7;
//        int a = 3;
//        int[] b = {4, 2, 4, 5, 3, 3, 1};
//        Solution solution = new Solution();
//        System.out.println(solution.solution(orders,a,b));
//
//    }
//}
