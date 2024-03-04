import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();
        
        long answer = input * (input - 1) / 2;
        
        System.out.println(answer);
        System.out.println(2);
    }
}