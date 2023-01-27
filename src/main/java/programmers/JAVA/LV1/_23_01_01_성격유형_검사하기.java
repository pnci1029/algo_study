import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < choices.length; i++) {
            if (choices[i] <= 3) {
                map.put(survey[i].substring(0, 1), map.getOrDefault(survey[i].substring(0, 1), 0) +4-choices[i]);
            } else if (choices[i] >= 4) {
                map.put(survey[i].substring(1, 2), map.getOrDefault(survey[i].substring(1, 2), 0) +choices[i]-4);
            }
        }
        if (map.getOrDefault("R", 0) >= map.getOrDefault("T", 0)) {
            answer += "R";
        } else {
            answer +="T";
        }
        if (map.getOrDefault("C", 0) >= map.getOrDefault("F", 0)) {
            answer += "C";
        } else {
            answer +="F";
        }
        if (map.getOrDefault("J", 0) >= map.getOrDefault("M", 0)) {
            answer += "J";
        } else {
            answer +="M";
        }
        if (map.getOrDefault("A", 0) >= map.getOrDefault("N", 0)) {
            answer += "A";
        } else {
            answer +="N";
        }


        return answer;
    }
}
