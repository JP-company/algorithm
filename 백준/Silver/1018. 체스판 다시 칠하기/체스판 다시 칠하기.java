import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        char[][] chess = new char[N][M];
        
        for (int i=0; i<N; i++) {
            String line = sc.next();
            for (int j=0; j<M; j++) {
                chess[i][j] = line.charAt(j);
            }
        }
        
        int answer = 64;
        for (int i=0; i<N-7; i++) {
            for (int j=0; j<M-7; j++) {
                int min = min(chess, i, j);
                answer = (answer < min) ? answer : min;
            }
        }
        System.out.println(answer);
    }
    
    public static int min(char[][] chess, int x, int y) {
        int count1 = 0;
        for (int i=x; i<x+8; i++) {
            if (i % 2 == 0) {
                for (int j=y; j<y+8; j++) {
                    char ch = j % 2 == 0 ? 'W' : 'B';
                    if (chess[i][j] != ch) count1++;
                }
                continue;
            }
            
            for (int j=y; j<y+8; j++) {
                char ch = j % 2 == 0 ? 'B' : 'W';
                if (chess[i][j] != ch) count1++;
            }
        }
        
        int count2 = 0;
        for (int i=x; i<x+8; i++) {
            if (i % 2 == 0) {
                for (int j=y; j<y+8; j++) {
                    char ch = j % 2 == 0 ? 'B' : 'W';
                    if (chess[i][j] != ch) count2++;
                }
                continue;
            }
            
            for (int j=y; j<y+8; j++) {
                char ch = j % 2 == 0 ? 'W' : 'B';
                if (chess[i][j] != ch) count2++;
            }
        }
        
        return count1 < count2 ? count1 : count2;
    }
}