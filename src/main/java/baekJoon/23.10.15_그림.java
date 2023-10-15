package com.example.tdd_prac;

import java.util.*;

/**
 6 5
 1 1 0 1 1
 0 1 1 0 0
 0 0 0 0 0
 1 0 1 1 1
 0 0 1 1 1
 0 0 1 1 1
 */

public class BackJoon {
    static int n;
    static int m;
    static Queue<Pair> queue;
    static int[][] box;
    static boolean[][] visit;
    static int[] dx;
    static int[] dy;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        queue = new LinkedList<>();
        box = new int[n][m];
        visit = new boolean[n][m];
        dx = new int[]{-1, 0, 1, 0};
        dy = new int[]{0, -1, 0, 1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int value = in.nextInt();
                box[i][j] = value;
            }
        }

        int count = 0;
        int area = 0;
        int max = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(box[i][j] == 0 || visit[i][j]){
                    continue;
                }
                System.out.print(i + "" + j);
                System.out.println();
                count++;
                queue.offer(new Pair(i, j));
                visit[i][j] = true;
                area = 0;
                while(!queue.isEmpty()){
                    Pair p = queue.poll();
                    area++;
                    for(int k = 0; k < 4; k++){
                        int n_x = p.x + dx[k];
                        int n_y = p.y + dy[k];
                        if(n_x < 0 || n_x >= n || n_y < 0 || n_y >= m){
                            continue;
                        }
                        if(box[n_x][n_y] == 1 && !visit[n_x][n_y]){
                            queue.offer(new Pair(n_x, n_y));
                            visit[n_x][n_y] = true;
                        }
                    }
                }
                if(area > max){
                    max = area;
                }
            }

        }
        System.out.println(count);
        System.out.println(max);


    }

    public static class Pair{
        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}

