//package baekJoon;/* package 구문을 넣으면 안됩니다 */
//
//import java.util.*;
//
///* [Notice for Java]
// * - 기본 제공되는 뼈대 코드는 입출력의 이해를 돕기위해 제공되었습니다.
// * - 뼈대코드의 활용은 선택사항이며 코드를 직접 작성하여도 무관합니다.
// *
// * - 별도의 병렬 처리나 시스템콜, 네트워크/파일접근 등을 하지 마세요
// * - 입출력의 양이 많은 문제는 BufferedReader와 BufferedWriter를 사용하면 시간을 단축할 수 있습니다.
// * - 클래스 이름은 항상 Main이어야 합니다. 주의하세요.
// * - 모든 입력과 출력은 System.in과 System.out 스트림을 이용해야 합니다.
// */
//
//public class Main {
//
//    //표준입력을 수행할 Scanner를 선언한다
//    public static Scanner scanner = new Scanner(System.in);
//
//
//    public static void main(String[] args) {   //프로그램의 시작부
//
////        int inPutI = scanner.nextInt();
//
//        List<String> box = new ArrayList<>();
//        String inPutS = "";
//
//        String type = "";
//
//        String numb = String.valueOf(scanner.nextLine());
//        String stringValue = String.valueOf(scanner.nextLine());
//        System.out.println("numb = " + numb);
//
//        if (stringValue.contains(" ")) {
//            type = "blank";
//            String[] split = stringValue.split(" ");
//            for (String s : split) {
//                box.add(s);
//            }
//        } else if (stringValue.contains("\t")) {
//            type = "tab";
//            String[] split = stringValue.split("\t");
//            for (String s : split) {
//                box.add(s);
//            }
//        } else {
//            type = "enter";
//            box.add(stringValue);
//            for (int i = 0; i < Integer.parseInt(numb) - 1; i++) {
//                box.add(String.valueOf(scanner.nextLine()));
////                inPutS = String.valueOf(scanner.nextLine());
////                System.out.println("inPutS = " + inPutS);
////                box.add(inPutS);
//            }
//
//        }
//
//
//        Map<String, Integer> hashMap = new HashMap<>();
//
//        List<Integer> result = new ArrayList<>();
//        for (String speed : box) {
//            hashMap.put(speed, hashMap.getOrDefault(speed, 0) + 1);
//        }
//
//        for (String speed : box) {
//            if (hashMap.get(speed) == 1) {
//                result.add(Integer.valueOf(speed));
//            }
//        }
//        Collections.sort(result);
//
//        StringBuilder sb = new StringBuilder();
//        if (type.equals("blank")) {
//            for (Integer integer : result) {
//                sb.append(integer).append(" ");
//            }
//            System.out.println(sb);
//        } else if (type.equals("tab")) {
//            for (Integer integer : result) {
//                sb.append(integer).append("\t");
//            }
//            System.out.println(sb);
//        } else {
//            for (Integer integer : result) {
//                sb.append(integer).append("\n");
//            }
//            System.out.println(sb);
//        }
//
//    }
//}