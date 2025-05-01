import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int length = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<length; i++){
            long value = sc.nextLong();

            for(long j =2; j<1000001; j++){
                if(value % j ==0){
                    
                    sb.append("NO").append("\n");
                    break;
                }
                if(j == 1000000){
                    sb.append("YES").append("\n");
                    break;
                }
            }
        }
        System.out.println(sb.toString());
    }
    
}
