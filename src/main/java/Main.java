class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] box = {"aya", "ye", "woo", "ma"};

        for (int i = 0; i < babbling.length; i++) {
            if (babbling[i].contains("aya")) {
                babbling[i] = babbling[i].replace("aya","1");
            }
            if (babbling[i].contains("woo")) {
                babbling[i] = babbling[i].replace("woo","1");
            }
            if (babbling[i].contains("ye")) {
                babbling[i] = babbling[i].replace("ye","1");
            }
            if (babbling[i].contains("ma")) {
                babbling[i] = babbling[i].replace("ma","1");
            }
        }

        for (String s : babbling) {
            if (s.equals("1") || s.equals("111") || s.equals("11") || s.equals("1111")) {
                answer++;
            }
            System.out.println("s = " + s);
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {

        String[] box = {"aya", "yee", "u", "maa", "wyeoo"};


        Solution solution = new Solution();
        System.out.println(solution.solution(box));
    }
}
