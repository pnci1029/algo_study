import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int N, int[] stages) {

        List<Integer> box = new ArrayList<>();
        List<Double> stageFailureRate = new ArrayList<>();
        List<Integer> zeroCollect = new ArrayList<>();
        for (int stage : stages) {
            box.add(stage);
        }

        int stageNumb = 1;
        double totalCount =  stages.length;
        while (true) {

            int failureRate = 0;
            for (int i = 0; i < box.size(); i++) {
                if (box.get(i) == stageNumb) {
                    failureRate++;
                }
            }

            if (totalCount != 0) {
                stageFailureRate.add(failureRate / totalCount);

            } else {
//                zeroCollect.add(i + 1);
                stageFailureRate.add(0.0);
            }
            System.out.println("stageFailureRate = " + stageFailureRate);
            totalCount -= failureRate;

            stageNumb++;
            if (stageNumb > N) {
                break;
            }
        }
        box.clear();
        int compare = stageFailureRate.size()-1;
        while (true) {
            for (int i = stageFailureRate.size()-2; i >= 0; i--) {
                if (stageFailureRate.get(compare) <= stageFailureRate.get(i)) {
                    compare = i;
                }
            }
            box.add(compare+1);

            stageFailureRate.set(compare,-1.0);

            if (box.size() == stageFailureRate.size()-1) {
                for (int i = 0; i < stageFailureRate.size(); i++) {
                    if (stageFailureRate.get(i) != -1.0) {
                        box.add(i + 1);
                    }
                }

                break;
            }
        }


        return box;
    }
}

public class Main {
    public static void main(String[] args) {

//        int b = 5;
//        int[] a = {2, 1, 2, 6, 2, 4, 3, 3};

        int b = 4;
        int[] a = {4,4,4,4};

//        int b = 5;
//        int[] a = {3,3,3,3};

        Solution solution = new Solution();
        System.out.println(solution.solution(b, a));
    }
}
