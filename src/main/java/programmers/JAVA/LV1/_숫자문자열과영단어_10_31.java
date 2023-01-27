//class Solution {
//    public int solution(String s) {
//        int answer = 0;
//
//        String[] split = s.split("");
//        for (int i = 0; i < split.length; i++) {
//            if (split[i].contains("z") ||split[i].contains("o") || split[i].contains("t") || split[i].contains("f") || split[i].contains("s") || split[i].contains("e") || split[i].contains("n")) {
//                s = s.replace("zero", "0");
//                s = s.replace("one", "1");
//                s = s.replace("two", "2");
//                s = s.replace("three", "3");
//                s = s.replace("four", "4");
//                s = s.replace("five", "5");
//                s = s.replace("six", "6");
//                s = s.replace("seven", "7");
//                s = s.replace("eight", "8");
//                s = s.replace("nine", "9");
//                break;
//            }
//        }
//
//        answer = Integer.parseInt(s);
//        return answer;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//
//        String s = "one4seveneight";
//        Solution solution = new Solution();
//        System.out.println(solution.solution(s));
//    }
//}
