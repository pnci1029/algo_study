//import java.util.*;
//class solution {
//    public int[] solution(int[] numbers) {
//        int numb = 0;
//
//        ArrayList<Integer> arr01 = new ArrayList<>();
//        ArrayList<Integer> arr02 = new ArrayList<>();
//
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers.length; j++) {
//                if (i != j) {
//                    arr01.add(numbers[i] + numbers[j]);
//                }
//            }
//        }
//
//        for (int i = 0; i < arr01.size(); i++) {
//            if (!arr02.contains(arr01.get(i))) {
//                arr02.add(arr01.get(i));
//            }
//        }
//        Collections.sort(arr02);
//        int[] answer = new int[arr02.size()];
//        for (int i = 0; i < answer.length; i++) {
//            answer[i] = arr02.get(i);
//        }
//
//        return answer;
//    }
//}
//
//
//
//public class main {
//
//    public static void main(String[] args) {
//        int[] numbers = {5,0,2,7};
//
//        solution sol = new solution();
//        sol.solution(numbers);
//        System.out.println(sol.solution(numbers));
//
//
//
////        ArrayList<Integer> arr01 = new ArrayList<>();
////        ArrayList<Integer> arr02 = new ArrayList<>();
////        for (int i = 0; i < numbers.length; i++) {
////            for (int j = 0; j < numbers.length; j++) {
////                if(i != j){
////                    arr01.add(numbers[i]+numbers[j]);
////                }
////            }
////        }
////        for (int i = 0; i < arr01.size(); i++) {
////            if (!arr02.contains(arr01.get(i))) {
////                arr02.add(arr01.get(i));
////            }
////        }
//////        정렬
////        Collections.sort(arr02);
////        System.out.println(arr02);
//
//    }
//}
