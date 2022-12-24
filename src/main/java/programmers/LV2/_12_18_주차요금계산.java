//import java.util.*;
//
//class Solution {
//    public int[] solution(int[] fees, String[] records) {
//
//        Map<String, Integer> timeMap = new HashMap<>();
//        Map<String, Integer> secondMap = new HashMap<>();
//
//        int inCount = 0;
//        int outCount = 0;
//        for (String record : records) {
//            String[] s = record.split(" ");
//
//            String[] split = s[0].split(":");
//            if (s[2].equals("IN")) {
//                timeMap.put(s[1], timeMap.getOrDefault(s[1], 0) - Integer.parseInt(split[0]));
//                secondMap.put(s[1], secondMap.getOrDefault(s[1],0) -Integer.parseInt(split[1]));
//                inCount++;
//            } else {
//                timeMap.put(s[1], timeMap.getOrDefault(s[1], 0) + Integer.parseInt(split[0]));
//                secondMap.put(s[1], secondMap.getOrDefault(s[1],0) +Integer.parseInt(split[1]));
//                outCount++;
//            }
//        }
//
//        for (String keys : timeMap.keySet()) {
//            if (secondMap.get(keys) < 0) {
//                secondMap.put(keys, secondMap.get(keys) + 60);
//                timeMap.put(keys, timeMap.get(keys) - 1);
//            }
//            if (timeMap.get(keys) < 0 ) {
//                timeMap.put(keys, timeMap.get(keys) + 23);
//                secondMap.put(keys, secondMap.get(keys) +59);
//                if (secondMap.get(keys) >= 60) {
//                    timeMap.put(keys, timeMap.get(keys) + 1);
//                    secondMap.put(keys, secondMap.get(keys) -60);
//                }
//            } else if (timeMap.get(keys) == 0 && secondMap.get(keys) == 0) {
//                timeMap.put(keys, timeMap.get(keys) + 23);
//                secondMap.put(keys, secondMap.get(keys) + 59);
//            }
//        }
//
//        int[] answer = new int[timeMap.size()];
//
//        Map<String, Integer> result = new HashMap<>();
//        for (String keys : timeMap.keySet()) {
//            result.put(keys, result.getOrDefault(keys, 0) + secondMap.get(keys));
//            result.put(keys, result.getOrDefault(keys, 0) + timeMap.get(keys)*60);
//        }
//
//        for (String keys : result.keySet()) {
//            if (result.get(keys) <= fees[0]) {
//                result.put(keys, fees[1]);
//            } else {
//                int ceil = (int)Math.ceil((double) (result.get(keys) - fees[0]) / fees[2]);
//                result.put(keys, ceil * fees[3] + fees[1]);
//            }
//        }
//
//        List<String> box = new ArrayList<>(result.keySet());
//        Collections.sort(box);
//        for (int i = 0; i < box.size(); i++) {
//            answer[i] = result.get(box.get(i));
//        }
//
//        System.out.println(Arrays.toString(answer));
//        return answer;
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
////        int[] a = {180, 5000, 10, 600};
////        String[] b = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
//
//        int[] a = {1, 461, 1, 10};
//        String[] b = {"00:00 1234 IN"};
//        Solution solution = new Solution();
//        System.out.println(solution.solution(a, b));
//
//    }
//}
