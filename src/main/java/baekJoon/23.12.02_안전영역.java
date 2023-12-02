package com.example.tdd_prac;

import java.util.*;

/**

 5
 6 8 2 6 2
 3 2 3 4 6
 6 7 3 3 2
 7 2 5 3 6
 8 9 5 2 7

 7
 9 9 9 9 9 9 9
 9 2 1 2 1 2 9
 9 1 8 7 8 1 9
 9 2 7 9 7 2 9
 9 1 8 7 8 1 9
 9 2 1 2 1 2 9
 9 9 9 9 9 9 9


 */

public class BackJoon {

    private static int N;
    private static int[][] box;
    private static boolean[][] booleans;
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0,-1, 0, 1};

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        box = new int[N][N];

        int maxHeight = 0;
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[i].length; j++) {
                box[i][j] = in.nextInt();
                maxHeight = Math.max(maxHeight, box[i][j]);
            }
        }

        int max =0;
        // 1. 모든 지역 탐색
        for(int height=0; height<maxHeight+1; height++) {
            booleans = new boolean[N][N];
            int cnt=0;
            for(int i=0; i<N; i++) {
                for(int j=0; j<N; j++) {
                    // 2. 안전 영역 탐지
                    if(!booleans[i][j] && box[i][j] > height){
                        cnt+=bfs(i,j,height); // 해당 안전영역 탐색 시작
                    }

                }
            }
            max = Math.max(max, cnt);
        }
        System.out.println(max);
    }

        private static int bfs(int x, int y, int height) {
            Queue<int[]> q = new LinkedList<>();
            q.add(new int[]{x,y});
            booleans[x][y] = true;

            while(!q.isEmpty()) {
                int[] pos = q.poll();
                int px = pos[0];
                int py = pos[1];

                for(int i=0; i<4; i++) {
                    int nx = px +dx[i];
                    int ny = py +dy[i];

                    if (nx < 0 || ny < 0 || nx > N - 1 || ny > N - 1) {
                        continue;
                    }
                    if(booleans[nx][ny]) continue;
                    if(box[nx][ny]> height) {
                        booleans[nx][ny] = true;
                        q.add(new int[] {nx,ny});
                    }
                }
            }
            return 1;
        }
}

