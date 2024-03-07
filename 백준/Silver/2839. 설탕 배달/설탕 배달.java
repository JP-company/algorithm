import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int min = -1;
        
        for (int i=0; i<=N/5; i++) {
            int kg = N - i * 5;
            if (kg % 3 == 0) {
                min = i + kg/3;
            }
        }
        
        System.out.println(min);
    }
}