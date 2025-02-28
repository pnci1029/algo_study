class Solution {
    public int maxVowels(String s, int k) {
        
        String word = "";
        int count = 0;
        String[] splits = s.split("");
        List<String> vowels = List.of("a", "e", "i", "o", "u");
        List<Integer> vowelCounts = new ArrayList<>();
        for(int i =0; i<k; i++){
            word += splits[i];
            if(vowels.contains(splits[i])){
                count++;
            }
        }
        vowelCounts.add(count);

        for(int i =1; i<s.length()-k +1; i++){
            if(vowels.contains(word.substring(0,1))){
                count--;
            }
            word = word.substring(1)+splits[i + k -1];
            
            if(vowels.contains(splits[i + k -1])){
                count++;
            }
            vowelCounts.add(count);
        }
        Collections.sort(vowelCounts);
        Collections.reverse(vowelCounts);

        return vowelCounts.get(0);
    }
}
