class Solution {
    public int solution(String word) {
        int answer = 0;
        String[] box = {"A", "E", "I", "O", "U"};
        int[] numbBox = {781, 156, 31, 6, 1};

        String[] split = word.split("");

        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("A")) {

            }
        }

        switch (split.length) {
            case 1:
                for (int i = 0; i < box.length; i++) {
                    if (split[0].equals(box[i])) {
                        answer = 781 * i + 1;
                    }
                }break;
            case 2:
                for (int i = 0; i < box.length; i++) {
                    if (split[0].equals(box[i])) {
                        answer += 781 * i + 1;
                    }
                    if (split[1].equals(box[i])) {
                        answer += 156 * i + 1;
                    }
                }break;
            case 3:
                for (int i = 0; i < box.length; i++) {
                    if (split[0].equals(box[i])) {
                        answer += 781 * i + 1;
                    }
                    if (split[1].equals(box[i])) {
                        answer += 156 * i + 1;
                    }
                    if (split[2].equals(box[i])) {
                        answer += 31 * i + 1;
                    }
                }break;
            case 4:
                for (int i = 0; i < box.length; i++) {
                    if (split[0].equals(box[i])) {
                        answer += 781 * i + 1;
                    }
                    if (split[1].equals(box[i])) {
                        answer += 156 * i + 1;
                    }
                    if (split[2].equals(box[i])) {
                        answer += 31 * i + 1;
                    }
                    if (split[3].equals(box[i])) {
                        answer += 6 * i + 1;
                    }
                }break;
            case 5:
                for (int i = 0; i < box.length; i++) {
                    if (split[0].equals(box[i])) {
                        answer += 781 * i + 1;
                    }
                    if (split[1].equals(box[i])) {
                        answer += 156 * i + 1;
                    }
                    if (split[2].equals(box[i])) {
                        answer += 31 * i + 1;
                    }
                    if (split[3].equals(box[i])) {
                        answer += 6 * i + 1;
                    }
                    if (split[4].equals(box[i])) {
                        answer +=  i+1;
                    }
                }break;
        }


        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        String a = "AAAAE";
//        String a = "A";

        Solution solution = new Solution();
        System.out.println(solution.solution(a));
    }
}
