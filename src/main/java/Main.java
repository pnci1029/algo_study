class Solution{
    public int solution(int n, int a, int b){
        int answer = 1;

        while (true) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            if (a == b) {
                break;
            }
            answer++;

        }

        return answer;
    }
}
public class Main {
    public static void main(String[] args) {

        int n = 8;
        int a = 4;
        int b = 7;


        Solution solution = new Solution();
        System.out.println(solution.solution(n,a,b));
    }
}
