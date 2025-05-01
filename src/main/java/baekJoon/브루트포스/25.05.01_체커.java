import java.util.*;

/*
 
4
15 14
15 16
14 15
16 15

4
1 1
2 1
4 1
9 1
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int []result = new int[length];
        int [][] box = new int[length][2];

        for(int i =0; i< length; i++){

            box[i][0] = sc.nextInt();
            box[i][1] = sc.nextInt();
        }

        result[0] = 0;
        for(int i = 2; i<=length; i++){
            int moves = Integer.MAX_VALUE;

            for(int a = 0; a<length; a++){
                for(int b = 0; b<length; b++){
                    int centerX = box[a][0];
                    int centerY = box[b][1];

                    List<Integer> distance = new ArrayList<>();
                    for(int c = 0; c<length; c++){
                        int compareX = box[c][0];
                        int compareY = box[c][1];

                        int dist = Math.abs(centerX - compareX) + Math.abs(centerY - compareY);
                        distance.add(dist);
                    }
                    Collections.sort(distance);

                    int totalMoves = 0;
                    for(int d = 0; d<i; d++){
                        totalMoves += distance.get(d);
                    }

                    moves = Math.min(moves, totalMoves);
                }
            }

            result[i -1 ] = moves;
        }
        

        StringBuilder sb = new StringBuilder();
        for(int i =0; i<length; i++){
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb);
        
    }
}



// v1
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        List<Integer> xBox = new ArrayList<>();
        List<Integer> yBox = new ArrayList<>();

        for(int i =0; i< length; i++){
            xBox.add(sc.nextInt());
            yBox.add(sc.nextInt());
        }

        for(int i =0; i< length; i++){
            int targetX = xBox.get(i);
            int targetY = yBox.get(i);

            int xMin = Integer.MAX_VALUE;
            int yMin = Integer.MAX_VALUE;
            for(int j =0; j< length; j++){


            }
        }

        System.out.println(xBox);
        System.out.println(yBox);
        
    }
}
