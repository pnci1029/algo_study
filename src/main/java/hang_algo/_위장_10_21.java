//import java.util.HashMap;
//
//class Solution {
//    public int solution(String[][] clothes) {
//        int answer = 1;
//        HashMap<String, Integer> result = new HashMap<>();
//
//        for (int i = 0; i < clothes.length; i++) {
//            result.put(clothes[i][1], result.getOrDefault(clothes[i][1],0) +1);
//        }
//        for (Integer value : result.values()) {
//            answer *= value+1;
//        }
//        return answer -1;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
//        String[][] clothes2 = {{"yellow_hat", "face"}, {"blue_sunglasses", "face"}, {"green_turban", "face"}};
//        Solution solution = new Solution();
//        System.out.println(solution.solution(clothes));
//        System.out.println(solution.solution(clothes2));
//    }
//}
