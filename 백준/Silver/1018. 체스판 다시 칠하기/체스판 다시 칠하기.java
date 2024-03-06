import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        boolean[][] chess = new boolean[N][M];
        
        for (int i=0; i<N; i++) {
            String line = sc.next();
            for (int j=0; j<M; j++) {
                chess[i][j] = line.charAt(j) == 'W';
            }
        }
        
        int answer = 64;
        for (int i=0; i<N-7; i++) {
            for (int j=0; j<M-7; j++) {
                int min = min(chess, i, j);
                answer = Math.min(answer, min);
            }
        }
        System.out.println(answer);
    }
    
    public static int min(boolean[][] chess, int x, int y) {
        boolean TF = true;
        int count = 0;
        
        for (int i=x; i<x+8; i++) {
            for (int j=y; j<y+8; j++) {
                if (chess[i][j] != TF) count++;
                TF = !TF;
            }
            TF = !TF;
        }
        
        return Math.min(count, 64 - count);
    }
}