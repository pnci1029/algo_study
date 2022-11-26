import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        Map<Integer, Integer> box = new HashMap<>();

        for (int i : tangerine) {
            box.put(i, box.getOrDefault(i, 0) + 1);
        }

        List<Integer> numbBox = new ArrayList<>();

        for (Integer integer : box.keySet()) {
            numbBox.add(box.get(integer));
        }
        Collections.sort(numbBox);
        Collections.reverse(numbBox);

        for (Integer integer : numbBox) {
            if (integer >= k) {
                answer++;
                break;
            } else {
                k -= integer;
                answer++;
            }
        }



        System.out.println("numbBox = " + numbBox.toString());
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {

        int a = 6;
        int[] b = {1, 3, 2, 5, 4, 5, 2, 3};
//        int a = 2;
//        int[] b = {1, 1, 1, 1, 2, 2, 2, 3};
//        int a = 4;
//        int[] b = {1, 3, 2, 5, 4, 5, 2, 3};


        Solution solution = new Solution();
        System.out.println(solution.solution(a, b));
    }
}
