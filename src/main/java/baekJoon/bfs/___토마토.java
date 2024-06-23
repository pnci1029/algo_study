package baekJoon.bfs;

import java.util.*;

/**

 6 4
 0 0 0 0 0 0
 0 0 0 0 0 0
 0 0 0 0 0 0
 0 0 0 0 0 1

 6 4
 0 -1 0 0 0 0
 -1 0 0 0 0 0
 0 0 0 0 0 0
 0 0 0 0 0 1
 */
public class TOMATO {

    static int[]dx;
    static int[]dy;

    static Queue<Pair> queue;
    static int[][] farm;
    static int[][] distinct;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int width = in.nextInt();
        int height = in.nextInt();
        dx = new int[]{-1, 0, 1, 0};
        dy = new int[]{0, 1, 0,-1};
        farm = new int[height][width];
        queue = new LinkedList<>();
        distinct = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int value = in.nextInt();
                farm[i][j] = value;
                if (value == 1) {
//                    distinct[i][j] = 1;
                    queue.offer(new Pair(i, j));
                }
                if (value == 0) {
                    distinct[i][j] = -1;
                }
            }
        }

        int count = 0;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (farm[i][j] != 0 || distinct[i][j] == 1) {
                    continue;
                }

//                queue.offer(new Pair(i, j));
                while (!queue.isEmpty()) {
                    Pair poll = queue.poll();

                    for (int k = 0; k < dx.length; k++) {
                        int nx = dx[k] + poll.getX();
                        int ny = dy[k] + poll.getY();

                        if (nx < 0 || ny < 0 || nx >= height || ny >= width) {
                            continue;
                        }
                        if (distinct[nx][ny] >=0) {
                            continue;
                        }
                        distinct[nx][ny] = distinct[poll.getX()][poll.getY()]+1;
                        queue.offer(new Pair(nx, ny));
                    }
                }

            }
        }

        boolean isBlocked = false;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (distinct[i][j] == -1) {
                    isBlocked = true;
                }
                count = Math.max(count, distinct[i][j]);
            }
        }
        System.out.println(!isBlocked ? count : -1);
//        System.out.println(count);



    }

    static class Pair{
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
