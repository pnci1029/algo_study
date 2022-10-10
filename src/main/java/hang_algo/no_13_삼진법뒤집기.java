//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.List;
//
//public class main {
//    public static void main(String[] args) {
//
////        45의 3진수 -> 1200  변환 0> 0021
////        0021 - > 3^3 * 0 , 3^2 * 0 , 3^1 * 2 3^0 *1 => 7
//
//        int input = 45;
//        int nam = 0;
//        int result = 0;
//        int answer = 0;
//
//        ArrayList<Integer> box = new ArrayList<>();
//
//        while (input > 0) {
//            nam = input % 3;
//            input /= 3;
////            System.out.println(nam);
//            box.add(nam);
//        }
////    0 0 1 2 => 2 1 0 0
//        for (int i = 0; i < box.size(); i++) {
//            result = (int) ((box.get(box.size() - 1-i))*Math.pow(3,i));
//            answer +=result;
//        }
//        System.out.println(answer);
//
//
//
//
//
//
//
//
//
//
//
//
//
////        ArrayList<Integer> box = new ArrayList<>();
////        int mok = 45;
////        int nam = 0;
////        int result = 0;
////
////        while (mok > 0) {
////            nam = mok % 3;
////            mok/=3;
////            box.add(nam);
////            System.out.println(nam);
////        }
////        System.out.println(box.size());
////            box  -> 0 1 2 2
////
////        for (int i = 0; i < box.size(); i++) {
////            result += (box.get(box.size()-1-i))*Math.pow(3,i);
////            System.out.println(result);
////        }
//
//
//    }
//}
