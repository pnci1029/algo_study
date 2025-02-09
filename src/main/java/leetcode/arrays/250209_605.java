class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int[] duplicated = Arrays.copyOf(flowerbed, flowerbed.length);
        if(n==0){
            return true;
        }

        if(duplicated.length == 1){
            return duplicated[0] != n;
        }

        for(int i =0; i< duplicated.length; i++){
            if(i ==0 ) {
                if((duplicated[i] == duplicated[i+1]) && (duplicated[i] ==0)){
                    duplicated[i] = 1;
                }
            } else if(i == duplicated.length - 1){
                if((duplicated[i] == duplicated[i-1]) && (duplicated[i] ==0)){
                    duplicated[i] = 1;
                }
            } else {
                if((duplicated[i-1] == duplicated[i]) && (duplicated[i] == duplicated[i+1]) && duplicated[i] == 0){
                duplicated[i] = 1;
            }
            }
            
        }

        System.out.println(Arrays.toString(duplicated));
        count = 0;
        for(int i =0; i< duplicated.length; i++){
            duplicated[i] = duplicated[i] -flowerbed[i];
            
            if(duplicated[i] ==1){
                count++;
            }
        }



        System.out.println(Arrays.toString(duplicated));

        
        return count >= n;
    }
}

// V2
class Solution {
   public boolean canPlaceFlowers(int[] flowerbed, int n) {
       // n이 0이면 항상 true
       if (n == 0) return true;
       
       // 배열 길이가 1인 경우 특별 처리
       if (flowerbed.length == 1) {
           return flowerbed[0] == 0 && n <= 1;
       }

       int[] flower = Arrays.copyOf(flowerbed, flowerbed.length);
       int flowersPlanted = 0;

       // 꽃을 심을 수 있는 위치 찾기
       for (int i = 0; i < flower.length; i++) {
           if (canPlantFlower(flower, i)) {
               flower[i] = 1;
               flowersPlanted++;
           }
       }

       return flowersPlanted >= n;
   }

   // 특정 위치에 꽃을 심을 수 있는지 확인하는 메서드
   private boolean canPlantFlower(int[] flower, int position) {
       // 현재 위치가 이미 심어져 있으면 false
       if (flower[position] == 1) return false;

       if (position == 0) {
           // 맨 앞자리인 경우
           return flower[1] == 0;
       } else if (position == flower.length - 1) {
           // 맨 뒷자리인 경우
           return flower[position - 1] == 0;
       } else {
           // 중간 위치인 경우
           return flower[position - 1] == 0 && flower[position + 1] == 0;
       }
   }
}
