v1
class Solution {
    public boolean closeStrings(String word1, String word2) {
        String []splitA = word1.split("");
        String []splitB = word2.split("");

        Map<String, Integer> boxA = new HashMap<>();
        Map<String, Integer> boxB = new HashMap<>();
        
        int resultA = 0;
        int resultB = 0;

        Set<String> setA = new HashSet<>();
        Set<String> setB = new HashSet<>();

        for(String value : splitA){
            int nums = boxA.getOrDefault(value, 0) +1;
            boxA.put(value, nums);
            resultA += nums;
            setA.add(value);
        }

        for(String value : splitB){
            int nums = boxB.getOrDefault(value, 0) +1;
            boxB.put(value, nums);
            resultB += nums;
            setB.add(value);
        }

        return resultA == resultB && setA.equals(setB);
    }
}


v2
class Solution {
    public boolean closeStrings(String word1, String word2) {
        // 길이가 다르면 바로 false 반환
        if (word1.length() != word2.length()) {
            return false;
        }
        
        // 각 문자의 출현 빈도수 계산
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        
        // 문자 존재 여부 확인용 비트마스크
        int mask1 = 0;
        int mask2 = 0;
        
        for (int i = 0; i < word1.length(); i++) {
            freq1[word1.charAt(i) - 'a']++;
            freq2[word2.charAt(i) - 'a']++;
            
            // 비트마스크로 각 문자의 존재 여부 표시
            mask1 |= (1 << (word1.charAt(i) - 'a'));
            mask2 |= (1 << (word2.charAt(i) - 'a'));
        }
        
        // 두 문자열에 동일한 종류의 문자가 있는지 확인
        if (mask1 != mask2) {
            return false;
        }
        
        // 빈도수 정렬 및 비교
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        
        // 빈도수 배열 비교
        return Arrays.equals(freq1, freq2);
    }
}
