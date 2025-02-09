class Solution {
    public String mergeAlternately(String word1, String word2) {
        String[] wordA = word1.split("");
        String[] wordB = word2.split("");

        int maxLength = Math.max(wordA.length, wordB.length);
        String answer = "";

        for (int i = 0; i < maxLength; i++) {
            if(i<wordA.length){
                answer += wordA[i];
            }

            if(i<wordB.length){
                answer += wordB[i];
            }
        }

        return answer;
    }
}
