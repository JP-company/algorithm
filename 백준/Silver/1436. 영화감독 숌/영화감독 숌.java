import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        int answer = 665;
        for (int i=0; i<input; i++) {
            do {
                answer++;
            } while(!isContain666(answer));
        }
        System.out.println(answer);
    }
    
    public static boolean isContain666(int input) {
        return String.valueOf(input).contains("666");
    }
}