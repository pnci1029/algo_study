import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int input = sc.nextInt();

        int count = 0;
        for(int a = 0; a<=input; a++){
            for(int b= 0; b<=input; b++){
                for(int c= 0; c<=input; c++){
                    if((a + b + c == input) && (
                        (a >= b+2) && a>0 && b>0 && c>0 &&
                        c%2 ==0
                    )){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);

    }
    
}
