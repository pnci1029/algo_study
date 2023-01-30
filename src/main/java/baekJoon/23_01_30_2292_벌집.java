import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int idx = 1;
        int numb = 6;
        int count = 1;
        while (true) {
            idx += numb;
            numb += 6;
            count++;
            if(a==1){
                count = 1;
                break;
            }
            if (idx >= a) {
                break;
            }
        }
        System.out.println(count);

    }
}
