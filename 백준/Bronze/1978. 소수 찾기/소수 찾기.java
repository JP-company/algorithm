import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberTotal = sc.nextInt();
        int answer = 0;
        
        for (int i=0; i<numberTotal; i++) {
            int number = sc.nextInt();
            if (isPrimeNumber(number)) {
                answer++;
            }
        }
        System.out.println(answer);
    }
    
    public static boolean isPrimeNumber(int number) {
        if (number == 1) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }
        int squaredNumber = (int) Math.sqrt(number);
        for (int j=2; j<=squaredNumber; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}