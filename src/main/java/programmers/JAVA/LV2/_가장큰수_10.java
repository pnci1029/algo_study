//import java.util.*;
//
//class Solution {
//    public String solution(int[] numbers) {
//        String answer = "";
//
//        List<Integer> numberBox = new ArrayList<>();
//        for (int number : numbers) {
//            numberBox.add(number);
//        }
//
//        List<Integer> box = new ArrayList<>();
//        List<Integer> removeBox = new ArrayList<>();
//        Map<Integer, List<Integer>> map = new HashMap<>();
//
//        int numb = 9;
//        while (true) {
//            List<Integer> compareBox = new ArrayList<>();
//            for (int i = 0; i < numberBox.size(); i++) {
//                if (numberBox.get(i) < 10) {
//                    if (numberBox.get(i) == numb) {
//                        box.add(numberBox.get(i));
//                        removeBox.add(i);
//                        compareBox.add(numberBox.get(i));
//                    }
//                } else {
//                    int n = numberBox.get(i);
//                    while (n >= 10) {
//                        n /= 10;
//                    }
//                    if (n == numb) {
//                        box.add(numbers[i]);
//                        removeBox.add(i);
//                        compareBox.add(numberBox.get(i));
//                    }
//                }
//            }
//            map.put(numb, compareBox);
//            numb--;
//            if (numb == 0) {
//                break;
//            }
//        }
//        List<Integer> result = new ArrayList<>();
//        int deleteIdx = 0;
//
//        for (int j = 9; j >= 1; j--) {
//            List<Integer> value = map.get(j);
//            if (!value.isEmpty()) {
//                while (!value.isEmpty()) {
//
//                    double first = value.get(0);
//                    double compare = 0.0;
//                    double max = 0;
//                    if (first >= 10 && first < 100) {
//                        first = first / 10;
//                    } else if (first >= 100 && first < 1000) {
//                        first = first / 100;
//                    } else if (first >= 1000 && first < 10000) {
//                        first = first / 1000;
//                    }
//                    for (int i = 0; i < value.size(); i++) {
//                        compare = value.get(i);
//                        if (compare >= 10 && compare < 100) {
//                            compare = compare / 10;
//                        } else if (compare >= 100 && compare < 1000) {
//                            compare = compare / 100;
//                        }else if (compare >= 1000 && compare < 10000) {
//                            compare = compare / 1000;
//                        }
//                        if (first <= compare) {
//                            if (first == compare) {
//                                first = compare;
//                                deleteIdx = 0;
//                            } else {
//                                first = compare;
//                                deleteIdx = i;
//
//                            }
//                        }
//                    }
//                    result.add(value.get(deleteIdx));
//                    value.remove(deleteIdx);
//                }
//            }
//        }
//
//        for (Integer integer : result) {
//            answer += String.valueOf(integer);
//        }
//
//        return answer;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
////        int[] a = {100, 900, 3, 30, 152, 161, 34, 51, 9, 95, 11, 991, 999, 151};
//        int [] a = {3, 30, 34, 5, 9};
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a));
//
//    }
//}
