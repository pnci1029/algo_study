import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;


        List<Double> box = new ArrayList<>();
        Set<Double> compBox = new HashSet<>();
        for (int i = 0; i < dots.length; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                double first = dots[i][0] - dots[j][0];
                double sec = dots[i][1] - dots[j][1];
                double result = first / sec;
                box.add(result);
                compBox.add(result);
            }
        }
        if (box.size() != compBox.size()) {
            return 1;
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {

//        int[][] box = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        int[][] box = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};


        Solution solution = new Solution();
        System.out.println(solution.solution(box));
    }
}
