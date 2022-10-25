import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] box = new boolean[1000000];
        Arrays.fill(box,false);

        box[0] = box[1] = true;
        for (int i = 2; i * i < 1000000; i++) {
            for (int j = i * i; j < 1000000; j+=i) {
                    box[j] = true;
            }

        }

        for (int i = 0; i <= n; i++) {
            if (!box[i]) {
                answer++;
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {

        int n =10;
        Solution solution = new Solution();
        System.out.println(solution.solution(n));
    }
}
