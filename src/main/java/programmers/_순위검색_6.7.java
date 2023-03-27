//import java.util.*;
//
//class Solution {
//    public int[] solution(String[] info, String[] query) {
//        int[] answer = new int[info.length];
//
//        List<String> infos = new ArrayList<>();
//
//        Map<Integer, String[]> box = new HashMap<>();
//        Map<Integer, String[]> compare = new HashMap<>();
//
//        for (int i = 0; i < info.length; i++) {
//            String[] s = info[i].split(" ");
//            box.put(i, s);
//        }
//
//        for (int i = 0; i < query.length; i++) {
//            String[] s = query[i].split(" ");
//            compare.put(i, s);
//        }
//
////        for (String[] value : box.values()) {
////            System.out.println(Arrays.toString(value));
////        }
////        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
////        for (String[] value : compare.values()) {
////            System.out.println(Arrays.toString(value));
////        }
//
//        for (int i = 0; i < answer.length; i++) {
//            String[] compares = compare.get(i);
//
//            for (int j = 0; j < box.size(); j++) {
//                String[] boxes = box.get(j);
//                if (boxes[0].equals(compares[0]) || compares[0].equals("-")) {
//                    if (boxes[1].equals(compares[2]) || compares[2].equals("-")) {
//                        if (boxes[2].equals(compares[4]) || compares[4].equals("-")) {
//                            if (boxes[3].equals(compares[6]) || compares[6].equals("-")) {
//                                if (Integer.parseInt(boxes[4]) >= Integer.parseInt(compares[7])) {
//                                    answer[i]++;
//                                }
//                            }
//                        }
//                    }
//                }
//
//            }
//        }
//
//
//
//        return answer;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        String[] a = {"java backend junior pizza 150", "python frontend senior chicken 210", "python frontend senior chicken 150", "cpp backend senior pizza 260", "java backend junior chicken 80", "python backend senior chicken 50"};
//        String[] b = {"java and backend and junior and pizza 100", "python and frontend and senior and chicken 200", "cpp and - and senior and pizza 250", "- and backend and senior and - 150", "- and - and - and chicken 100", "- and - and - and - 150"};
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a, b));
//
//    }
//}
