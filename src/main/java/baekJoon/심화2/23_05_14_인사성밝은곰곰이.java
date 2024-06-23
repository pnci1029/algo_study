package baekJoon.심화2;

/**
 * 7 4
 * apple
 * ant
 * sand
 * apple
 * append
 * sand
 * sand
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 인사성밝은곰곰이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 문자
        StringTokenizer st = new StringTokenizer(br.readLine()); // 숫자

        int result = 0;
        int length = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < length; i++) {
            String value = br.readLine();
            if (value.equals("ENTER")) {
                count++;
//                System.out.println(set.size());
                result += set.size();
                set = new HashSet<>();
                set.add("ENTER");
            }
            if (set.size() > 0) {
                set.add(value);
            }
        }
        result += set.size() - count;

        System.out.println(result);

    }
}
