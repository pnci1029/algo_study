import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Long> solution(long[] numbers) {
        List<Long> result = new ArrayList<>();

        for (Long value : numbers) {
            String target = Long.toBinaryString(value);

            int count = 0;
            String answer = "";
            if (target.length() >= 2) {
                String numb = target.substring(target.length() - 2);
                if (numb.equals("00") || numb.equals("10")) {
                    result.add(value + 1);
                } else if (numb.equals("01")) {
                    result.add(value + 1);
                } else {
                    String[] split = target.split("");
                    int oneCount = split.length - 1;
                    while (true) {
                        if (split[oneCount].equals("1")) {
                            count++;
                        } else {
                            break;
                        }
                        oneCount--;
                        if (count >= split.length) {
                            break;
                        }
                    }

                    if (count == split.length) {
                        answer = "10";
                        count--;
                        while (count > 0) {
                            answer += "1";
                            count--;
                        }
                        result.add(Long.parseLong(answer, 2));
                        /**
                         * 1011 -> 1101
                         * 10011 -> 10101
                         */
                    } else {
                        answer += target.substring(0, split.length - count - 1) + "10";
                        count--;
                        while (count > 0) {
                            answer += "1";
                            count--;
                        }

                        result.add(Long.parseLong(answer, 2));
                    }
                }
            } else {
                result.add(value + 1);
            }
        }

        return result;
    }
}


public class Main {
    public static void main(String[] args) {

//        long[] a = {2, 1015};
        long[] a = {1001, 337, 0, 1, 333, 673, 343, 221, 898, 997, 121, 1015, 665, 779, 891, 421, 222, 256, 512, 128, 100};
        Solution solution = new Solution();
        System.out.println(solution.solution(a));

    }
}
