import java.util.*;

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
