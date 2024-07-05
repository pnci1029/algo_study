import java.util.*;

/**

 3
 c.user.mike.programs
 c.user.nike.programs
 c.user.rice.programs

 3
 config.sys
 config.inf
 configures
 */
public class BackJoon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();

        String compareWord = "";
        Set<Integer> questionSet = new HashSet<>();
        for (int i = 0; i < length; i++) {
            String word = in.next();
            if (i == 0) {
                compareWord = word;
            } else {
                String[] compares = compareWord.split("");

                for (int j = 0; j < compares.length; j++) {
                    if (compareWord.charAt(j) != word.charAt(j)) {
                        questionSet.add(j);
                    }
                }

            }
        }
        String[] compares = compareWord.split("");


        StringBuffer sb = new StringBuffer(compareWord);

        for (Integer i : questionSet) {
            sb.setCharAt(i,'?');
        }
//        String answer = "";
//        for (int i = 0; i < compares.length; i++) {
//            if (questionSet.contains(i)) {
//                answer += "?";
//            } else {
//                answer += compares[i];
//            }
//        }

        System.out.println(sb);


    }
}
