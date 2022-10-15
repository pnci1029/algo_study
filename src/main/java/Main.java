import java.util.*;

class Solution {
    HashSet<Integer> box = new HashSet<>();

    public void recursive(String comb, String others) {
        if (!comb.equals("")) {
            box.add(Integer.valueOf(comb));
        }
        for (int i = 0; i < others.length(); i++) {
            recursive(comb + others.charAt(i), others.substring(0,i) + others.substring(i+1));
        }
    }
    public int solution(String numbers) {

        recursive("", numbers);

        boolean[] isPrime = new boolean[10000000];
        isPrime[0] = isPrime[1] = true;
        for (int i = 2; i*i < 10000000; i++) {
            for (int j = i * i; j < 10000000; j+=i) {
                isPrime[j] = true;
            }
        }

        int answer = 0;
        for (Integer integer : box) {
            if (!isPrime[integer]) {
                answer++;
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        String numbers = "17";
        Solution solution = new Solution();
        System.out.println(solution.solution(numbers));

    }
}
