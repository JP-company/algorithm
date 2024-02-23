import java.util.Scanner;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minNum = sc.nextInt();
        int maxNum = sc.nextInt();
        
        int total = 0;
        int min = 0;
        for (int number=maxNum; number>=minNum; number--) {
            if (isPrimeNumber(number)) {
                total += number;
                min = number;
            }
        }
        
        if (total == 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(total);
        System.out.println(min);
    }
    
    private static boolean isPrimeNumber(int number) {
        if (number == 1) return false;
        if (number == 2 || number == 3) return true;
        
        int squaredNumber = (int) Math.sqrt(number);
        for (int i=2; i<=squaredNumber; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}