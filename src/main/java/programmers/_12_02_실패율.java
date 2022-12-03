//import java.util.*;
//
//class Solution {
//    public List<Integer> solution(int N, int[] stages) {
//
//        List<Integer> box = new ArrayList<>();
//        List<Integer> zeroCollect = new ArrayList<>();
//        for (int stage : stages) {
//            box.add(stage);
//        }
//
//        Map<Integer, Double> map = new HashMap<>();
//        List<Integer> stageFailureRate = new ArrayList<>();
//        int stageNumb = 1;
//        double totalCount = stages.length;
//
//        int n = stages.length;
//        for (int i = 1; i <= N; i++) {
//            int idxCount = 0;
//            for (int stage : stages) {
//                if (stage == i) {
//                    idxCount++;
//                }
//            }
//            if (idxCount != 0) {
//                map.put(i, ((double) idxCount / n));
//                n -= idxCount;
//            } else {
//                zeroCollect.add(i);
//            }
//
//        }
//        List<Integer> keySet = new ArrayList<>(map.keySet());
//        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
//
//
//        box.clear();
//
//        for (Integer integer : keySet) {
//            box.add(integer);
//        }
//
//        for (Integer integer : zeroCollect) {
//            box.add(integer);
//        }
//
////        while (true) {
////
////            int failureRate = 0;
////            for (int i = 0; i < box.size(); i++) {
////                if (box.get(i) == stageNumb) {
////                    failureRate++;
////                }
////                if (box.get(i) > N) {
////                    zeroIndex.add(i);
////                }
////                System.out.println("box.get(i) = " + box.get(i));
////            }
////
////            if (totalCount != 0) {
////                stageFailureRate.add(failureRate / totalCount);
////
////            }
////            zeroCollect.addAll(zeroIndex);
//////            else {
////////                zeroCollect.add(i + 1);
//////                stageFailureRate.add(0.0);
//////            }
////            System.out.println("stageFailureRate = " + stageFailureRate);
////            System.out.println("zeroIndex = " + zeroIndex);
////            System.out.println("zeroCollect = " + zeroCollect);
////            totalCount -= failureRate;
////
////            stageNumb++;
////            if (stageNumb > N) {
////                break;
////            }
////        }
////        box.clear();
////        int compare = stageFailureRate.size()-1;
////        while (true) {
////            for (int i = stageFailureRate.size()-2; i >= 0; i--) {
////                if (stageFailureRate.get(compare) <= stageFailureRate.get(i)) {
////                    compare = i;
////                }
////            }
////            box.add(compare+1);
////
////            stageFailureRate.set(compare,-1.0);
////
////            if (box.size() == stageFailureRate.size()-1) {
////                for (int i = 0; i < stageFailureRate.size(); i++) {
////                    if (stageFailureRate.get(i) != -1.0) {
////                        box.add(i + 1);
////                    }
////                }
////
////                break;
////            }
////        }
//
//
//        return box;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
////        int b = 5;
////        int[] a = {2, 1, 2, 6, 2, 4, 3, 3};
//
//        int b = 4;
//        int[] a = {4,4,4,4};
//
////        int b = 5;
////        int[] a = {3,3,3,3};
//
//        Solution solution = new Solution();
//        System.out.println(solution.solution(b, a));
//    }
//}
