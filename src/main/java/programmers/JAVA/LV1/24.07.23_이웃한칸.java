class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
        int [] dx = new int[]{-1,1,0,0};
        int [] dy = new int[]{0,0,-1,1};
        
        String targetColor = board[h][w];
        System.out.println(targetColor);
        
        int height = board.length-1;
        int width = board[0].length-1;
        
        for(int i=0; i<dx.length; i++){
            int nx = dx[i] + h;
            int ny = dy[i] + w;
            
            if(nx>=0 && ny>=0 && nx<board.length && ny<board[0].length){
                if(board[h][w].equals(board[nx][ny]))
                answer++;
            }
        }

        
//         if(height == 1 && width == 1){
            
//         }else{
//             if(h ==0 && w ==0){
//                 answer += isEuqal(board[h+1][w],targetColor);
//                 answer += isEuqal(board[h][w+1],targetColor);
//             }else if(h ==0 && w != width){
//                 answer += isEuqal(board[h+1][w],targetColor);
//                 answer += isEuqal(board[h][w+1],targetColor);
//                 answer += isEuqal(board[h][w-1],targetColor);
//             }else if(h!= height && w != width){
//                 answer += isEuqal(board[h+1][w],targetColor);
//                 answer += isEuqal(board[h-1][w],targetColor);
//                 answer += isEuqal(board[h][w+1],targetColor);
//                 answer += isEuqal(board[h][w-1],targetColor);
//             }else if(h== height && w != width){
//                 answer += isEuqal(board[h-1][w],targetColor);
//                 answer += isEuqal(board[h][w+1],targetColor);
//                 answer += isEuqal(board[h][w-1],targetColor);
//             }else if(h!= height && w == width){
//                 answer += isEuqal(board[h+1][w],targetColor);
//                 answer += isEuqal(board[h-1][w],targetColor);
//                 answer += isEuqal(board[h][w-1],targetColor);
//             }else{
//                 answer += isEuqal(board[h-1][w],targetColor);
//                 answer += isEuqal(board[h][w-1],targetColor);
//             }
//         }
        
      
        return answer;
    }
    
    
    private int isEuqal(String board, String target){
        return board.equals(target) ? 1 : 0;
    }
}
