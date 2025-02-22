class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() >t.length()){
            return false;
        }
        String[] sSplits = s.split("");
        String[] tSplits = t.split("");
        int sPointer = 0;
        int tPointer = 0;

        while(true){
            if(tPointer >=t.length() || sPointer >= s.length()){
                break;
            }

            if(sSplits[sPointer].equals(tSplits[tPointer])){
                sPointer++;
                tPointer++;
            }else {
                tPointer++;
            }

        }

        System.out.println(sPointer);
        System.out.println(tPointer);

        return sPointer == s.length();
    }
}
