import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();

        int[] a = new int[10];
        int[] b = new int[10];

        String[] splitA = X.split("");
        String[] splitB = Y.split("");

        for (String s : splitA) {
            a[Integer.parseInt(s)]++;
        }
        for (String s : splitB) {
            b[Integer.parseInt(s)]++;
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = a.length - 1; i >= 0; i--) {
            int min = Math.min(a[i], b[i]);
            if (a[i] >= 1 && b[i] >= 1) {
                hashMap.put(i, min);
            }
        }
        List<Integer> resultBox = new ArrayList<>();
        for (Integer key : hashMap.keySet()) {
            int hashBox = hashMap.get(key);
            while (hashBox >= 1) {
                hashBox--;
                resultBox.add(key);
            }
        }
        Collections.reverse(resultBox);

        for (Integer box : resultBox) {
            answer.append((box));
        }
        if (hashMap.isEmpty()) {
            return "-1";
        }
        if (answer.charAt(0) == '0') {
            return "0";
        }


        return answer.toString();
    }
}

public class Main {
    public static void main(String[] args) {

        String x = "000000000000000100000";
        String y = "0000000000000001111111111111100000";
        Solution solution = new Solution();
        System.out.println(solution.solution(x, y));
    }
}
