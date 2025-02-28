v1
class Solution {
    public int maxVowels(String s, int k) {
        
        String word = "";
        int vowelCount = 0;
        String[] splits = s.split("");
        String [] vowels = ["a", "e", "i", "o", "u"];
        List<String> box = new ArrayList<>();
        for(int i =0; i<k; i++){
            word += splits[i];
        
        }
        box.add(word);

        for(int i =1; i<s.length()-k; i++){
            word = word.substring(1)+splits[i + k -1];
            box.add(word);
        }

        System.out.println(Arrays.toString(splits));
        System.out.println("box : " + box);


        return 0;
    }
}
