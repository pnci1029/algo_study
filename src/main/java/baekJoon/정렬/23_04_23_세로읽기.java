package baekJoon.정렬;

import java.io.*;

public class 세로읽기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] box = new String[5][15];
            for (int i = 0; i < box.length; i++) {
                String[] split = br.readLine().split("");
                for (int j = 0; j < split.length; j++) {
                    if (split[j] == null) {
                        box[i][j] = " ";
                    }
                    box[i][j] = split[j];
                }
            }


        String answer = "";
        for (int i = 0; i < box[0].length; i++) {
            for (int j = 0; j < box.length; j++) {
                if (box[j][i] == null) {
                    continue;
                }
                answer += box[j][i];

            }
        }
        System.out.println(answer);


    }
}

