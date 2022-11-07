//
////class Solution {
////    public int solution(int[] ingredient) {
////        int answer = 0;
////
////        StringBuilder letter = new StringBuilder();
////        for (int i = 0; i < ingredient.length; i++) {
////            letter.append(ingredient[i]);
////            if (letter.length() > 3 && letter.subSequence(letter.length() - 4, letter.length()).equals("1231")) {
////                answer++;
////                letter.delete(letter.length() - 4, letter.length());
////            }
////        }
////
////
////        return answer;
////    }
////}
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner data = new Scanner(System.in);
//        int A = data.nextInt();
//        int B = data.nextInt();
//
//        System.out.println(A*(B%10));
//        System.out.println(A * ((B-(B / 100 * 100))/10));
//        System.out.println(A*(B/100));
//        System.out.println(A*B);
//
//
////        Solution solution = new Solution();
////        System.out.println(solution.solution(box));
//    }
//}
