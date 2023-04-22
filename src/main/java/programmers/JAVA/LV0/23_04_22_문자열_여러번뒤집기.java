class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";


        String[] target = my_string.split("");
        for (int[] query : queries) {
            String left = "";
            String right = "";

            if (query[1] - query[0] > 1) {
                int count = query[1];
                int divide = (query[1] - query[0]) / 2;
                for (int i = query[0]; i <= query[0]+divide; i++) {
                    left = target[i];
                    right = target[count];
                    target[i] = right;
                    target[count] = left;
                    count--;
                }
            } else {
                left = target[query[0]];
                right = target[query[1]];

                target[query[0]] = right;
                target[query[1]] = left;
            }
        }
     for (String s : target) {
            answer += s;
        }
        return answer;
    }}
