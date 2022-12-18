import java.util.*;

class Solution {
    public int[] solution(String[] info, String[] query) {
        int[] answer = new int[info.length];

        for (int i = 0; i < query.length; i++) {
            query[i] = query[i].replaceAll(" and", "");
        }

//        for (String s : info) {
//            System.out.println("info = " + s);
//        }
//        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//        for (String s : query) {
//            System.out.println("query = " + s);
//        }

        for (int i = 0; i < query.length; i++) {
            String[] querys = query[i].split(" ");
            for (int j = 0; j < info.length; j++) {
                String[] infos = info[j].split(" ");
                if (Integer.parseInt(infos[3]) >= Integer.parseInt(querys[3])) {

                } else {
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] a = {"java backend junior pizza 150", "python frontend senior chicken 210", "python frontend senior chicken 150", "cpp backend senior pizza 260", "java backend junior chicken 80", "python backend senior chicken 50"};
        String[] b = {"java and backend and junior and pizza 100", "python and frontend and senior and chicken 200", "cpp and - and senior and pizza 250", "- and backend and senior and - 150", "- and - and - and chicken 100", "- and - and - and - 150"};
        Solution solution = new Solution();
        System.out.println(solution.solution(a, b));

    }
}
