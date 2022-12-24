//import java.util.*;
//
//class Solution {
//    public List<Integer> solution(String s) {
//        int[] answer = {};
//
//        List<String> box = new ArrayList<>();
//
//        System.out.println(s);
//        s = s.substring(1, s.length() - 2);
//        s = s.replace("{", "");
//        String[] split = s.split("},");
//
//        for (String s1 : split) {
//            s1 = s1.replace("{", "");
//            s1 = s1.replace(",", "");
//            box.add(s1);
//        }
//
//        System.out.println(box);
//        List<Integer> result = new ArrayList<>();
//
//        Arrays.sort(split, new Comparator<String>() {
//            public int compare(String o1, String o2) {
//
//                return Integer.compare(o1.length(), o2.length());
//            }
//        });
//        System.out.println("split = " + Arrays.toString(split));
//
//        for (int i = 0; i < split.length; i++) {
//            String[] splits = split[i].split(",");
//            for (int j = 0; j < splits.length; j++) {
//                int a = Integer.parseInt(splits[j]);
//
//                if (!result.contains(a)) {
//                    result.add(a);
//                }
//            }
//        }
//        System.out.println(result);
//
//
//        return result;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//
////        String a = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
//        String a = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a));
//
//    }
//}
