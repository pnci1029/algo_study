//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class main {
//
//    public static void main(String[] args) {
//
//        int[] arr_01 = {1, 2, 3, 4};
//        int[] arr_02 = {1, 2,7, 6,4};
//        int r = 0;
//        Arrays.sort(arr_02);
//
//        ArrayList<Integer> box = new ArrayList<>();
//        ArrayList<Integer> arr = new ArrayList<>();
//
//
//        int test_input = 12;
//        String result = "";
//
////      입력받은 수가 소수인지 찾기기
//        for (int i = 2; i < test_input; i++) {
////            소수가 아닌경우
//            if (test_input % i == 0) {
//                result = test_input+"소수아님";
//                break;
//            }
//            else {
//                result=test_input+"소수";
//            }
//        }
//
//        int a =0;
//        int b =1;
//        int c =2;
//
//        for (a = 0; a < arr_01.length; a++) {
//            for (b = a+1; b < arr_01.length; b++) {
//                for (c = b+1; c < arr_01.length; c++) {
//                    if(a <b && a <c && b< c){
//                        r = arr_01[a] + arr_01[b] + arr_01[c];
//                        box.add(r);
//                    }
//                }
//            }
//        }
////        System.out.println(box.get(3));
//
////        전체 박스 데이터 출력
//        for (int i = 0; i < box.size(); i++) {
//            for(int  j =2; j<box.get(i)-1; j++){
//                if (box.get(i) % j != 0) {
//
//                }
//            }
//        }
//        System.out.println(box.get(0));
//
//    }
//}
