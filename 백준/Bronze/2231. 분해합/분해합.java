import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = String.valueOf(n).length();
        
        for (int i=n-(9*digit); i<n; i++) {
            int num = i;
            int digitSum = 0;
            while (num > 0) {
                digitSum += num % 10;
                num /= 10;
            }
            
            if (digitSum + i == n) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}