import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int row = 2;
        for (int i=0; i<N; i++) {
            row += Math.pow(2, i);
        }
        System.out.println(row * row);
    }
}