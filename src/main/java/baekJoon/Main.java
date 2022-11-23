package baekJoon;/* package 구문을 넣으면 안됩니다 */

import java.io.*;
import java.lang.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine().trim());
        String input, output;
        for (int i = 0; i < n; i++) {
            input = reader.readLine().trim();

            output = Main.stringBeautify(input);

            writer.write(output + "\n");
        }

        writer.flush();
        writer.close();
        reader.close();
    }

    public static String stringBeautify(String input) {
        /**
         * a / e / i / o /  u
         */

        String[] wordBox = {"a", "e", "i", "o", "u"};
        String word = input;

        List<String> box = new ArrayList<>();
        String[] split = word.split("");
        box.addAll(Arrays.asList(split));

        if (box.size() > 1) {
            for (int i = 0; i < box.size()-1; i++) {
                if (box.get(i).equals("a") || box.get(i).equals("e") || box.get(i).equals("i") ||
                        box.get(i).equals("o") || box.get(i).equals("u")) {
                    while (true) {
                        int count = 0;
                        if (box.get(i+1).equals("a") || box.get(i+1).equals("e") || box.get(i+1).equals("i") ||
                                box.get(i+1).equals("o") || box.get(i+1).equals("u")) {
                            box.remove(i + 1);
                            count++;
                        }
                        if (count == 0) {
                            break;
                        }

                    }
                }
            }
        }
        System.out.println("box.toString() = " + box.toString());


        return "";
    }
}
