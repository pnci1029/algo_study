import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 1;
        String wordRole = "^[A-Z]*$";
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        String[] split1 = str1.split("");
        String[] split2 = str2.split("");


        List<String> box1 = new ArrayList<>();
        List<String> box2 = new ArrayList<>();

        for (int i = 0; i < split1.length - 1; i++) {
            String value1 = split1[i] + split1[i + 1];
            if (value1.matches(wordRole)) {
                box1.add(value1);
            }
        }
        for (int i = 0; i < split2.length - 1; i++) {
            String value2 = split2[i] + split2[i + 1];
            if (value2.matches(wordRole)) {
                box2.add(value2);
            }
        }

//        if (box1.isEmpty() || box2.isEmpty()) {
//            return 65536;
//        }

        Collections.sort(box1);
        Collections.sort(box2);

        List<String> gyo = new ArrayList<>();
        List<String> hap = new ArrayList<>();
        for (String s : box1) {
            if (box2.remove(s)) {
                gyo.add(s);
            }
            hap.add(s);
        }
        for (String s : box2) {
            hap.add(s);
        }

        double result = 0;

        if (hap.size() == 0) {
            return 65536;
        }

        if (gyo.size() == 0 && hap.size() > 0) {
            return 0;
        }
        result = (double) gyo.size() / (double) hap.size();
        return (int) (result * 65536);

//
//////        stream으로 두 리스트간에 동일한 값 저장
//        List<String> resultList1 = box1.stream()
//                .filter(box1value -> box2.stream().anyMatch(Predicate.isEqual(box1value)))
//                .collect(Collectors.toList());
//
//        List<String> resultList2 = box2.stream()
//                .filter(box2value -> box1.stream().anyMatch(Predicate.isEqual(box2value)))
//                .collect(Collectors.toList());
//
//        if (resultList1.isEmpty() || resultList2.isEmpty()) {
//            return 0;
//        }
//
//
////        int answer1 =  (int)((double)65536*resultList1.size() / (box1.size() + box2.size() - resultList1.size()));
////        int answer2 =  (int)((double)65536*resultList2.size() / (box1.size() + box2.size() - resultList2.size()));
//
//        double answer1 =  ((double)resultList1.size() / (double)(box1.size() + box2.size() - resultList1.size()));
//        double answer2 =  ((double)resultList2.size() / (double)(box1.size() + box2.size() - resultList2.size()));
//
//
//
//        if (resultList1.equals(resultList2)) {
//            return (int) (answer2*65536);
//        } else {
//            if (resultList1.size() > resultList2.size()) {
//                System.out.println("resultList2");
//                return (int) (answer2*65536);
//            } else {
//                System.out.println("resultList1");
//                return (int) (answer1 * 65536);
//            }
//        }
    }
}

public class Main {
    public static void main(String[] args) {
//        String a = "FRANCE";
//        String b = "french";

        String a = "A+C";
        String b = "EF";

//        String a = "BAAAA";
//        String b = "AAA";

//        String a = "aabbc";
//        String b = "abbde";

//        String a = "E=M*C^2";
//        String b = "e=m*c^2";

//        String a = "handshake";
//        String b = "shake hands";
        Solution solution = new Solution();
        System.out.println(solution.solution(a,b));

    }
}
