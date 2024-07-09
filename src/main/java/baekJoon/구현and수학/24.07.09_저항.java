
import java.util.*;

/**

 yellow
 violet
 red
 */
public class BackJoon {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String first = in.next();
        String second = in.next();
        String third = in.next();
        Map<String, long[]> box = new HashMap<>();

        box.put("black", new long[]{0L, 1L});
        box.put("brown", new long[]{1L, 10L});
        box.put("red", new long[]{2L, 100L});
        box.put("orange", new long[]{3L, 1000L});
        box.put("yellow", new long[]{4L, 10000L});
        box.put("green", new long[]{5L, 100000L});
        box.put("blue", new long[]{6L, 1000000L});
        box.put("violet", new long[]{7L, 10000000L});
        box.put("grey", new long[]{8L, 100000000L});
        box.put("white", new long[]{9L, 1000000000L});


        long firstValue = box.get(first)[0];
        long secondValue = box.get(second)[0];
        long thirdValue = box.get(third)[1];

        long result = (firstValue * 10 + secondValue) * thirdValue;
//        System.out.println(thirdValue / 10 * secondValue);
        System.out.println(result);


    }
}
