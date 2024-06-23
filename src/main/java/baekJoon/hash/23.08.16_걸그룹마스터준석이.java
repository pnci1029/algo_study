package baekJoon.hash;

import java.util.*;

/**
 * 4
 2
 3
 hat headgear
 sunglasses eyewear
 turban headgear
 3
 mask face
 sunglasses face
 makeup face
 */

public class rjfrmfnqaktmxj {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        int quest = in.nextInt();

        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            List<String> arr = new ArrayList<>();
            String groupName = in.next();
            int groupCount = in.nextInt();
            for (int j = 0; j < groupCount; j++) {
                String memberName = in.next();
                arr.add(memberName);
            }
            Collections.sort(arr);
            map.put(groupName, arr);
        }
//        System.out.println(map);

        for (int i = 0; i < quest; i++) {
            String questMember = in.next();
            String questType = in.next();

            if (questType.equals("0")) {
                List<String> strings = map.get(questMember);
                for (String string : strings) {
                    System.out.println(string);
                }
            } else {
                for (String s : map.keySet()) {
                    if (map.get(s).contains(questMember)) {
                        System.out.println(s);
                    }
                }
//                for (List<String> value : map.values()) {
//                    if (value.contains(questMember)) {
//                        System.out.println();
//                    }
//                }
            }

        }

    }

}
