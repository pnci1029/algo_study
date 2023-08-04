import java.util.*;

/**
 * 150
 * 266
 * 427
 */
public class BackJoon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int _case = in.nextInt();

        String[][] arr= new String[_case][2];

        for(int i=0;i<_case;i++) {
            arr[i][0]=in.next();
            arr[i][1]=in.next();
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[] s2) {
                return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
            }

        });

        for(int i=0;i<_case;i++) {
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }

    }

}
