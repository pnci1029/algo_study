import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int numb = 0;

        for (int i : number) {
            numb += i;
        }
        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> resultMap = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            hashMap.put(want[i], number[i]);
        }

        for (int i = 0; i <= discount.length - numb; i++) {
            resultMap = new HashMap<>();
            for (int j = i; j < i + 10; j++) {
                resultMap.put(discount[j], resultMap.getOrDefault(discount[j], 0) + 1);
            }
            if (resultMap.equals(hashMap)) {
                answer++;
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {

        String[] board = {"banana", "apple", "rice", "pork", "pot"};
        int[] numb = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana",
                "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        Solution solution = new Solution();
        System.out.println(solution.solution(board,numb,discount));
    }
}
