//import java.util.ArrayList;
//import java.util.List;
//import java.util.Stack;
//
//class Solution {
//    public int solution(String s) {
//        int answer = 0;
//
//        String[] split = s.split("");
//        Stack<String> stack = new Stack<>();
//        List<String> box = new ArrayList<>();
//        for (String s1 : split) {
//            box.add(s1);
//        }
//
//        int counts = 0;
//        while (true) {
//            int count = 0;
//            stack = new Stack<>();
//            for (int i = 0; i < box.size(); i++) {
//                if (stack.isEmpty()) {
//                    stack.push(box.get(i));
//                } else if (box.get(i).equals(")")) {
//                    if (stack.peek().equals("(")) {
//                        stack.pop();
//                    } else {
//                        stack.push(box.get(i));
//                    }
//                } else if (box.get(i).equals("}")) {
//                    if (stack.peek().equals("{")) {
//                        stack.pop();
//                    } else {
//                        stack.push(box.get(i));
//                    }
//                } else if (box.get(i).equals("]")) {
//                    if (stack.peek().equals("[")) {
//                        stack.pop();
//                    } else {
//                        stack.push(box.get(i));
//                    }
//                } else {
//                    stack.push(box.get(i));
//                }
//
//            }
//            if (stack.isEmpty()) {
//                answer++;
//            }
//
//            counts++;
//            box.add(box.get(0));
//            box.remove(0);
//            if (counts == box.size()) {
//                break;
//            }
//        }
//        return answer;
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//
////        String b = "}]()[{";
//        String b = "[](){}";
//        Solution solution = new Solution();
//        System.out.println(solution.solution(b));
//    }
//}
