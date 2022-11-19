//class Solution {
//    public String solution(String new_id) {
//        StringBuilder answer = new StringBuilder();
//        String[] split = new_id.split("");
//
//        String small = "^[a-z]*$";
//
//        if (new_id.isEmpty()) {
//            new_id += "a";
//        }
//
//
//        for (int i = 0; i < split.length; i++) {
//            split[i] = split[i].toLowerCase();
//            if (!(split[i].matches(small) || split[i].equals("-") || split[i].equals("_") || split[i].equals("."))) {
//                split[i] = "";
//            }else {
//                answer.append(split[i]);
//            }
//
//        }
//        new_id = answer.toString();
//        while (true) {
//            int count = 0;
//            if (new_id.contains("..")) {
//                new_id = new_id.replace("..", ".");
//                count++;
//            }
//            if (count == 0) {
//                break;
//            }
//        }
//        String[] spl = new_id.split("");
//        answer = new StringBuilder();
//
//        for (String s : spl) {
//            answer.append(s);
//        }
//        if (answer.length() >= 16) {
//            answer = new StringBuilder(answer.substring(0, 15));
//        }
//
//        if (spl[0].equals( ".")) {
//            spl[0] = spl[0].replace(".", "");
//        }
//        if (spl[spl.length-1].equals(".")) {
//            spl[spl.length-1] = spl[spl.length-1].replace(".", "");
//        }
//        System.out.println("answer = " + answer);
//
//
//
//        return answer.toString();
//    }
//
//    public String split(String[] spl) {
//        String answer = "";
//        if (spl[0].equals( ".")) {
//            spl[0] = spl[0].replace(".", "");
//        }
//        if (spl[spl.length-1].equals(".")) {
//            spl[spl.length-1] = spl[spl.length-1].replace(".", "");
//        }
//        for (String s : spl) {
//            answer += s;
//        }
//        return answer;
//
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        String board = "...!@BaT#*..y.abcdefghijklm.";
////        String board = "c";
//        Solution solution = new Solution();
//        System.out.println(solution.solution(board));
//    }
//}
