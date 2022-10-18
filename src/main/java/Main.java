import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;

            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }

        return answer;
    }
}
public class Main {
    public static void main(String[] args) {

        int[] box = {3, 0, 6, 1, 5};
        Solution solution = new Solution();
        System.out.println(solution.solution(box));
    }
}
