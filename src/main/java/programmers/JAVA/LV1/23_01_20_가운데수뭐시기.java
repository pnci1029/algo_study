class Solution {
    public String solution(String s) {
        String answer = "";
        String[] split = s.split("");
        if (s.length() % 2 == 0) {
            answer += split[split.length/2-1];
            answer += split[split.length/2];
        } else {
            answer += split[(split.length+1)/2-1];
        }
        return answer;
    }}
