//import java.util.*;
//
//class Solution {
//    public List<String> solution(String[] record) {
//        String[] answer = new String[record.length];
//
//        int numb = 0;
//        Map<String, String> map = new HashMap<>();
//        for (int j =0; j< record.length; j++) {
//            String[] s1 = record[j].split(" ");
//
//            int first = 0;
//            String second = "";
//            String third = "";
//            for (int i = 0; i < s1.length; i++) {
//                if (s1[i].contains("Change")) {
//                    numb = j;
//                }
//                if (s1[0].equals("Enter")) {
//                    first = 1;
//                    second = s1[1];
//                    third = s1[2];
//                    map.put(s1[1], s1[2]);
//                } else if (s1[0].equals("Leave")) {
//                    first = 2;
//                    second = s1[1];
//                    map.put(s1[1], map.get(s1[1]));
//                } else {
//                    first = 3;
//                    second = s1[1];
//                    third = s1[2];
//                    map.put(s1[1], s1[2]);
//                }
//                if (first == 1) {
//                    answer[j] = third + " Enter "+second;
//                } else if (first == 2) {
//                    answer[j] = second + " Leave "+second;
//                } else {
//                    answer[j] = third + " Change " + second;
//                }
//
//
//            }
//        }
//
//        List<String> box = new ArrayList<>();
//        for (int i = 0; i < answer.length; i++) {
//            String[] s = answer[i].split(" ");
//            if (s[1].equals("Enter")) {
//                box.add(map.get(s[2]) + "님이 들어왔습니다.");
//            } else if (s[1].equals("Leave")) {
//                box.add(map.get(s[2]) + "님이 나갔습니다.");
//
//            }
//        }
//
//        return box;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        String[] a = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
////        String[] b = {"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."};
//
//
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a));
//    }
//}
