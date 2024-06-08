package com.example.jenkinstest;

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
    static int[][] board;
    static Queue<Pair> queue;
    static int[][] visit;
    static int[] dx;
    static int[] dy;



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();
        board = new int[N][M];
        queue = new LinkedList<>();
        visit = new int[N][M];
        dx = new int[]{-1, 0, 1, 0};
        dy = new int[]{0, -1, 0, 1};

        for (int i = 0; i < N; i++) {
            String[] split = in.next().split("");
            for (int j = 0; j < split.length; j++) {
                board[i][j] = Integer.parseInt(split[j]);
                visit[i][j] = 0;

            }

        }

        int count = 0;
        int max = 0;
        int area = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (visit[i][j] == -1 || board[i][j] == 0) {
                    continue;
                }

                count++;
                queue.offer(new Pair(i, j));
//                visit[i][j]= 0;

                area = 0;
                while (!queue.isEmpty()) {
                    Pair p = queue.poll();
                    area++;

                    for (int k = 0; k < 4; k++) {
                        int nX = p.x + dx[k];
                        int nY = p.y + dy[k];

                        if (nX < 0 || nY < 0 || nX >= N || nY >= M) {
                            continue;
                        }


                        if (visit[nX][nY] ==0 && board[nX][nY] == 1) {
                            queue.offer(new Pair(nX, nY));
                            visit[nX][nY] = visit[p.x][p.y]+1;
                        }
                    }
                }
                if (area > max) {
                    max = area;
                }

            }
        }

        System.out.println(visit[N-1][M-1]+1);

    }

    public static class Pair {
        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
