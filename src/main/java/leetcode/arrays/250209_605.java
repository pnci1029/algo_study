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
