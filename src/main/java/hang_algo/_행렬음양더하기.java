//import java.util.Arrays;
//
//public class Main {
//    public int[][] solution(int[][] arr1, int[][] arr2, boolean[][] signs) {
//        int[][] answer = new int [arr1.length][arr1[0].length];
//
//        for (int i =0 ; i < arr1.length; i++) {
//            for (int j = 0; j < arr2[0].length; j++) {
//                answer[i][j] += arr1[i][j] + arr2[i][j];
//                if(signs[i][j])
//                    answer[i][j] = answer[i][j];
//                else if(!signs[i][j]){
//                    answer[i][j] = -answer[i][j];
//                }
//            }
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Main method = new Main();
//        int[][] arr1 = {{5,7,1},{2,3,5}};
//        int[][] arr2 = {{5,1,6},{7,5,6}};
//        boolean[][] signs={{true,true,false},{false,true,false}};
//        System.out.println(Arrays.deepToString(method.solution(arr1, arr2, signs)));
//    }
//}