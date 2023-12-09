package com.example.tdd_prac;

import java.util.*;

/**

 <problem>17413<is hardest>problem ever<end>

 one1 two2 three3 4fourr 5five 6six

 <ab cd>ef gh<ij kl>


 <   space   >space space space<    spa   c e>

 <abc><abc>ab

 a b a<cbe>

 <int><max>2147483647<long long><max>9223372036854775807
 <> hi hi  hi
 */

public class BackJoon {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String target = " ";
        target += in.nextLine();
//        target += " ";

        String[] split = target.split("");
        List<String> arr = new ArrayList<>();
        boolean check = false;
        boolean normalCheck = false;
            StringBuilder data = new StringBuilder();
        for (String s : split) {
            if (s.equals("<")) {
                if (normalCheck) {
                    data.reverse();
                    if (data.toString().contains(" ")) {
                        String[] s1 = data.toString().split(" ");
                        for (int i = s1.length - 1; i >= 0; i--) {
                                arr.add(s1[i]);
                            if (i !=0) {
                                arr.add(" ");
                            }
                        }
                    } else {
                        arr.add(data.toString());
                    }
                    data = new StringBuilder();
                }
                check = true;
                normalCheck = false;
            }else if(s.equals(">")){
                check = false;
                normalCheck = true;
                data.append(">");
                arr.add(data.toString().trim());
                data = new StringBuilder();
            }
            if (check) {
                data.append(s);
            } else if (normalCheck) {
                if (!s.equals(">")) {
                    data.append(s);
                }
            } else {
                if (data.toString().length() > 1 && s.equals(" ")) {
                    data.reverse();
                    arr.add(data.toString());
                    data = new StringBuilder();
                    normalCheck = false;
                }
                data.append(s);
            }


//            if (s.equals("<")) {
//                check = true;
//                normalCheck = false;
//                if (normalCheck && data.length()>1) {
//                    data.reverse();
//                    if (data.toString().contains(" ")) {
//                        String[] split1 = data.toString().split(" ");
//                        arr.add(split1[1]);
//                        arr.add(" ");
//                        arr.add(split1[0]);
//                    } else {
//                        arr.add(data.toString());
//                    }
//                    data = new StringBuilder();
//                }
//            } else if (s.equals(">")) {
//                data.append(">");
//                arr.add(data.toString().trim());
//                data = new StringBuilder();
//                check = false;
//            } else if (!normalCheck) {
//                System.out.println(s);
////                data.reverse();
////                if (data.toString().contains(" ")) {
////                    String[] split1 = data.toString().split(" ");
////                    arr.add(split1[1]);
////                    arr.add(" ");
////                    arr.add(split1[0]);
////                } else {
////                    arr.add(data.toString());
////                }
////                data = new StringBuilder();
//            } else {
//                if (!check) {
//                    normalCheck = true;
//                    data.append(s);
//                }
////                else {
////                    normalCheck = true;
////                    data.append(s);
////                }
//            }
//            if (check) {
//                data.append(s);
//            }
        }
        if (!data.toString().equals(" ")) {
            if (data.toString().contains(" ")) {
            data.reverse();
                String[] s = data.toString().split(" ");
                for (int i = s.length - 1; i >= 0; i--) {
                    arr.add(s[i]);
                    if (i !=0) {
                        arr.add(" ");
                    }
                }
            } else {
                arr.add(data.toString());
            }
            System.out.println("data = " + data);
        }
        StringBuilder result = new StringBuilder();
        for (String s : arr) {
            result.append(s);
        }
        System.out.println(result.toString().trim());

    }



}

