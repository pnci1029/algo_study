import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer =  new int[2];
        int max = Math.max(n, m);
        int min = Math.min(n, m);

        List<Integer> maxBox = new ArrayList<>();
        List<Integer> minBox = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            if (max % i == 0) {
                maxBox.add(i);
            }
        }

        for (int i = 1; i <= min; i++) {
            if (min % i == 0) {
                minBox.add(i);
            }
        }
        int count = 0;
        for (int i = minBox.size() - 1; i >= 0; i--) {
            int numb = 0;
            for (int j = maxBox.size() - 1; j >= 0; j--) {
                if (minBox.get(i).equals(maxBox.get(j))) {
                    count = minBox.get(i);
                    numb++;
                    break;
                }
            }
            if (numb != 0) {
                break;
            }
        }
        answer[0] = count;
        answer[1] = max * min / count;


        return answer;
    }
}

public class Main {
    public static void main(String[] args) {

        int a= 3;
        int b = 12;
        Solution solution = new Solution();
        System.out.println(solution.solution(a,b));
    }
}
