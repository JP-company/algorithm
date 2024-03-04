import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong() - 2L;
        
        long answer = (n*n*n + 3*n*n + 2*n) / 6;
        
        System.out.println(answer);
        System.out.println(3);
    }
}