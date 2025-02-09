class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int max = Math.max(str1.length(), str2.length());
        int commonNumber = 0;
        for(int i = max; i >= 1; i--){
            if ((str1.length() % i == 0) && (str2.length() % i == 0)) {
                commonNumber = i;
                break;
            }
        }

        return str1.substring(0, commonNumber);
    }
}
