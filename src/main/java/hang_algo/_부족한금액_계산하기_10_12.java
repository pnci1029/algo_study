//
//class Solution {
//    public long solution(int price, int money, int count) {
//
//        long sum = 0;
//        long answer = 0;
//        for (int i = 1; i <= count; i++) {
//            sum += (long)price * i;
//        }
//        answer = sum - money;
//        if (money - sum > 0) {
//            return 0;
//        } return answer;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        int price = 3;
//
//        int money = 20;
//
//        int count = 4;
//
//        Solution solution = new Solution();
//        System.out.println(solution.solution(price, money, count));
//
//    }
//}
