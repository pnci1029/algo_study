package com.example.jenkinstest;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

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
    static int N;
    static int M;
    static int[][] ref;
    static int[][] board;
    static Queue<Pair> queue;
    static int []dx ;
    static int []dy ;
    static boolean[][] visit;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();
        ref = new int[N][M];
//        board = new int[502][502];
        queue = new ArrayDeque<>();

        /**
         * dx, dy 가 저런 순서를 가져야 하는 이유가 있음
         * i가 0, 1 , 2, 3일때 -1,0  0,-1 등이 되어야 하지
         * -1,-1  1,1 이렇게 들어가면 상하좌우를 탐색하지 못함
         */
        dx = new int[]{-1, 0, 1, 0};
        dy = new int[]{0, -1, 0, 1};
        visit = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int value = in.nextInt();
                ref[i][j] = value;
            }
        }

        int count = 0;
        int area = 0;
        int max = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

                // 방문한 좌표
                if (ref[i][j] == 0 || visit[i][j]) {
                    continue;
                }

                // 방문할 시점 표기
                count++;

                // 큐에 현재 위치 추가
                queue.offer(new Pair(i, j));
                // 방문 정보 추가
                visit[i][j] = true;

                // 탐색하기전에 탐색 위치 크기 초기화
                area = 0;
                while (!queue.isEmpty()) {
                    // 추가한 현재 위치 제거
                    Pair p = queue.poll();
                    // 영역을 추가로 방문했으니 +
                    area++;

                    for (int k = 0; k < 4; k++) {
                        /**
                          poll한 현재위치에서 상하좌우 탐색
                          ex) p가 0,0인 경우
                            nx는 각각 -1(0+(-1)), 0, 1, 0
                            ny는 각각 0, -1, 0, 1 탐색

                            -> 즉 (-1,0),(0,-1),(1,0),(0,1) 탐색
                         */

                        int nX = p.x + dx[k];
                        int nY = p.y + dy[k];

                        if (nX >= N || nY >= M || nX < 0 || nY < 0) {
                            continue;

                        }

                        // 상하좌우 위치가 방문안하고 유효한 위치인지 확인
                        if (!visit[nX][nY] && ref[nX][nY] == 1) {
                            // 방문안하고 유효한 위치라면 큐에 추가
                            queue.offer(new Pair(nX, nY));
                            visit[nX][nY] = true;

                        }

                    }

                }
                if (area > max) {
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
