import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input == 1) return;
        
        outer:
        while (true) {
            int squaredRoot = (int) Math.sqrt(input);
            
            for (int i=2; i<=squaredRoot; i++) {
                if (input % i == 0) {
                    input /= i;
                    System.out.println(i);
                    continue outer;
                }
            }
            
            System.out.println(input);
            break;
        }
    }
}