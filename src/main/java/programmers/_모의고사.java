//import java.util.*;
//class Solution {
//    public int[] solution(int[] answers) {
//        int[] answer = {};
//
//        ArrayList<Integer> stu_01 = new ArrayList<>();
//        ArrayList<Integer> stu_02 = new ArrayList<>();
//        ArrayList<Integer> stu_03 = new ArrayList<>();
//
//        ArrayList<Integer> result = new ArrayList<>();
//
//
//        int stu__001 = 0;
//        int stu__002 = 0;
//        int stu__003 = 0;
//
//        for (int i = 0; i < answers.length; i++) {
////            학생1
//            if(i%5==0){
//                stu_01.add(1);
//            } else if (i % 5 == 1) {
//                stu_01.add(2);
//            } else if (i % 5 == 2) {
//                stu_01.add(3);
//            } else if (i % 5 == 3) {
//                stu_01.add(4);
//            } else if (i % 5 == 4) {
//                stu_01.add(5);
//            }
//
////            학생2
//            if (i % 2 == 0) {
//                stu_02.add(2);
//            } else if (i % 8 == 1) {
//                stu_02.add(1);
//            }else if (i % 8 == 3) {
//                stu_02.add(3);
//            } else if (i % 8 == 5) {
//                stu_02.add(4);
//            } else if (i % 8 == 7) {
//                stu_02.add(5);
//            }
//
////            학생3
//            if (i % 10 == 0) {
//                stu_03.add(3);
//            } else if (i % 10 == 1) {
//                stu_03.add(3);
//            } else if (i % 10 == 2) {
//                stu_03.add(1);
//            } else if (i % 10 == 3) {
//                stu_03.add(1);
//            } else if (i % 10 == 4) {
//                stu_03.add(2);
//            } else if (i % 10 == 5) {
//                stu_03.add(2);
//            } else if (i % 10 == 6) {
//                stu_03.add(4);
//            } else if (i % 10 == 7) {
//                stu_03.add(4);
//            } else if (i % 10 == 8) {
//                stu_03.add(5);
//            } else if (i % 10 == 9) {
//                stu_03.add(5);
//            }
//        }
//
//        for (int i = 0; i < answers.length; i++) {
//            if (stu_01.get(i).equals(answers[i])) {
//                stu__001++;
//            }
//            if (stu_02.get(i).equals(answers[i])) {
//                stu__002++;
//            }
//            if (stu_03.get(i).equals(answers[i])) {
//                stu__003++;
//            }
//        }
//
//
//
//        if (stu__001 > stu__002 && stu__001 > stu__003) {
//            result.add(1);
//        } else if (stu__002 > stu__001 && stu__002 > stu__003) {
//            result.add(2);
//        } else if (stu__003 > stu__001 && stu__003 > stu__002) {
//            result.add(3);
//        } else if (stu__001 >= stu__002 && stu__001 > stu__003) {
//            result.add(1);
//            result.add(2);
//        } else if (stu__001 > stu__002 && stu__001 >= stu__003) {
//            result.add(1);
//            result.add(3);
//        } else if (stu__002 > stu__001 && stu__002 >= stu__003) {
//            result.add(3);
//            result.add(2);
//        } else if (stu__001 >= stu__002 && stu__001 >= stu__003) {
//            result.add(1);
//            result.add(2);
//            result.add(3);
//        }
////      Math.
//        answer = new int[result.size()];
//
//        for (int i = 0; i < answer.length; i++) {
//            answer[i] = result.get(i);
//        }
//
//        return answer;
//    }
//}
//
//public class main {
//
//    public static void main(String[] args) {
//        int[] answer = {1,3,2,4,2};
//        Solution sol = new Solution();
//        System.out.println(sol.solution(answer));
//
////        ArrayList<Integer> stu_01 = new ArrayList<>();
////        ArrayList<Integer> stu_02 = new ArrayList<>();
////        ArrayList<Integer> stu_03 = new ArrayList<>();
////
////        ArrayList<String> result = new ArrayList<>();
////
////
////        int stu__001 = 0;
////        int stu__002 = 0;
////        int stu__003 = 0;
////
////        for (int i = 0; i < answer.length; i++) {
////////            학생1
////            if(i%5==0){
////                stu_01.add(1);
////            } else if (i % 5 == 1) {
////                stu_01.add(2);
////            } else if (i % 5 == 2) {
////                stu_01.add(3);
////            } else if (i % 5 == 3) {
////                stu_01.add(4);
////            } else if (i % 5 == 4) {
////                stu_01.add(5);
////            }
////
////////            학생2
////            if (i % 2 == 0) {
////                stu_02.add(2);
////            } else if (i % 8 == 1) {
////                stu_02.add(1);
////            }else if (i % 10 == 3) {
////                stu_02.add(3);
////            } else if (i % 10 == 5) {
////                stu_02.add(4);
////            } else if (i % 10 == 7) {
////                stu_02.add(5);
////            } else if (i % 10 == 9) {
////                stu_02.add(1);
////            }
////
////////            학생3
////            if (i % 10 == 0) {
////                stu_03.add(3);
////            } else if (i % 10 == 1) {
////                stu_03.add(3);
////            } else if (i % 10 == 2) {
////                stu_03.add(1);
////            } else if (i % 10 == 3) {
////                stu_03.add(1);
////            } else if (i % 10 == 4) {
////                stu_03.add(2);
////            } else if (i % 10 == 5) {
////                stu_03.add(2);
////            } else if (i % 10 == 6) {
////                stu_03.add(4);
////            } else if (i % 10 == 7) {
////                stu_03.add(4);
////            } else if (i % 10 == 8) {
////                stu_03.add(5);
////            } else if (i % 10 == 9) {
////                stu_03.add(5);
////            }
////        }
////
////        for (int i = 0; i < 5; i++) {
////            if (stu_01.get(i).equals(answer[i])) {
////                stu__001++;
////            }
////            if (stu_02.get(i).equals(answer[i])) {
////                stu__002++;
////            }
////            if (stu_03.get(i).equals(answer[i])) {
////                stu__003++;
////            }
////        }
////
////
////        if (stu__001 > stu__002 && stu__001 > stu__003) {
////            result.add("stu__001");
////        } else if (stu__002 > stu__001 && stu__002 > stu__003) {
////            result.add("stu__002");
////        } else if (stu__003 > stu__001 && stu__003 > stu__002) {
////            result.add("stu__003");
////        } else if (stu__001 >= stu__002 && stu__001 > stu__003) {
////            result.add("stu__001");
////            result.add("stu__002");
////        } else if (stu__001 > stu__002 && stu__001 >= stu__003) {
////            result.add("stu__001");
////            result.add("stu__003");
////        } else if (stu__002 > stu__001 && stu__002 >= stu__003) {
////            result.add("stu__003");
////            result.add("stu__002");
////        } else if (stu__001 >= stu__002 && stu__001 >= stu__003) {
////            result.add("stu__001");
////            result.add("stu__002");
////            result.add("stu__003");
////        }
////
////
////        System.out.println(result);
//
//
////        System.out.println(stu__001);
////        System.out.println(stu__002);
////        System.out.println(stu__003);
//
//    }
//}
