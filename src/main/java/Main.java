class Solution {
    public int solution(int n) {
        int answer = 0;

        String numb = Integer.toString(n, 3);


        String[] split = numb.split("");

        String reverse = "";
        for (int i = numb.length()-1; i >= 0; i--) {
            reverse += split[i];
        }
        answer = Integer.parseInt(reverse, 3);


        return answer;
    }
}

public class Main {
    public static void main(String[] args) {


        int a = 125;


        Solution solution = new Solution();
        System.out.println(solution.solution(a));
    }
}
