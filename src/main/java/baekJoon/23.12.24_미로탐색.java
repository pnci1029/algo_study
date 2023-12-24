package com.example.tdd_prac;

import java.util.*;

/**
 4 6
 101111
 101010
 101011
 111011

 */

public class BackJoon {

    static int N;
    static int M;
    static int[][] box;
    static int[][] visit;
    static int[] dx;
    static int[] dy;
    static Queue<Pair> queue;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
        box = new int[N][M];
        visit = new int[N][M];
        dx = new int[]{1, 0, -1, 0};
        dy = new int[]{0, -1, 0, 1};
        queue = new LinkedList<>();
        System.out.println(N);
        System.out.println(M);
        for (int i = 0; i < N; i++) {
            String[] split = in.next().split("");
            for (int j = 0; j < split.length; j++) {
                box[i][j] = Integer.parseInt(split[j]);
                visit[i][j] = -1;

            }

        }
        System.out.println(Arrays.deepToString(box));

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 0 && visit[i][j]==-1) {
                    continue;
                }
                queue.offer(new Pair(i, j));
                visit[0][0] = 0;
                while (!queue.isEmpty()) {
                    Pair p = queue.poll();

                    for (int k = 0; k < 4; k++) {
                        int kx = p.x + dx[k];
                        int ky = p.y + dy[k];
                        if (kx < 0 || kx >= N || ky < 0 || ky >= M) {
                            continue;
                        }
                        if (box[kx][ky] == 1 && visit[kx][ky] == -1) {
                            queue.offer(new Pair(kx, ky));
                            visit[kx][ky] =visit[p.x][p.y]+1;
                        }
                    }
                }
            }
        }
        System.out.println(visit[N-1][M-1]+1);

    }

    public static class Pair{
        int x, y;

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}

