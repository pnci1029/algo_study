
/**
 5 0
 -7 -3 -2 5 8

 5 -2
 -1 -1 -1 -1 -1
 */
public class BackJoon {
    static int N;
    static int M;
    static int[] sample;
    static int sum = 0;
    static int result = 0;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();
        sample = new int[N];


        for (int i = 0; i < N; i++) {
            int value = in.nextInt();
            sample[i] = value;
        }
        DFS(0, 0);
        System.out.println(result);

    }

    static void DFS(int value, int depth) {
        if (depth == N) {
            if (value == M) {
                result++;

            }
            return;
        }

            /**
             * 양의 방향으로만 계산 (value -> value 삽입)
             * 반복문 처리 안하고 DFS의 value안에 이미 합 계산 (value = sample[depth])
             */
            DFS(value + sample[depth], depth + 1);

        /**
         * 양의방향으로 더할수도있고 안더할수있기 떄문에 추가
         */
            DFS(value, depth + 1);
    }
}
