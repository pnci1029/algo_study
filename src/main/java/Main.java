class Solution {
    public String solution(String new_id) {
        String answer = "";
        String big = "^[A-Z]*$";
        String small = "^[a-z0-9]*$";

        String[] split = new_id.split("");
        new_id = "";
        for (String s : split) {
            if (s.matches(big)) {
                new_id += s.toLowerCase();
            } else if (s.matches(small)) {
                new_id += s;
            } else if (s.equals("-") || s.equals("_") || s.equals(".")) {
                new_id += s;
            }
        }
        System.out.println("new_id = " + new_id);

        while (true) {
            int count = 0;

            if (new_id.equals(".")) {
                new_id = "a";
                break;
            }
            String[] split1 = new_id.split("");

            if (new_id.contains("..")) {
                new_id = new_id.replace("..", ".");
                count++;
            }
            if (split1[0].equals(".")) {
                new_id = new_id.substring(1);
            }

            // if (split1[split1.length - 1].equals(".")) {
            //     new_id = new_id.substring(0, new_id.length() - 1);
            // }
            if (count == 0) {
                break;
            }
        }

        if (new_id.isEmpty()) {
            new_id = "a";
        }

        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
        }

        if (String.valueOf(new_id.charAt(new_id.length() - 1)).equals(".")) {
            new_id = new_id.substring(0, new_id.length() - 1);
        }

        if (new_id.length() <= 2) {
            String word = String.valueOf(new_id.charAt(new_id.length() - 1));
            while (true) {
                if (new_id.length() == 3) {
                    break;
                } else {
                    new_id += word;
                }
            }
        }
        return new_id;
    }
}

public class Main {
    public static void main(String[] args) {

//        String board = "...!@BaT#*..y.abcdefghijklm.";
//        String board = "c";
//        String board = "=.=";
//        String board = "z-+.^.";
//        String board = "123_.def";
        String board = "abcdefghijklmn.p";
        Solution solution = new Solution();
        System.out.println(solution.solution(board));
    }
}
