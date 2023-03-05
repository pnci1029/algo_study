import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int[] dist = new int[1000001];
        Arrays.fill(dist, -1);
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(x);
        dist[x] = 0;
        while (!q.isEmpty()) {
            int cur = q.remove();
            if (cur == y) {
                return dist[cur];
            }
            if (cur + n <= y && dist[cur + n] == -1) {
                q.add(cur + n);
                dist[cur + n] = dist[cur] + 1;
            }
            if (cur * 2 <= y && dist[cur * 2] == -1) {
                q.add(cur * 2);
                dist[cur * 2] = dist[cur] + 1;
            }
            if (cur * 3 <= y && dist[cur * 3] == -1) {
                q.add(cur * 3);
                dist[cur * 3] = dist[cur] + 1;
            }
        }
        return -1;
    }
}
