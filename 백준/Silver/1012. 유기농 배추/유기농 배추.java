import java.util.*;
import java.io.*;

public class Main {
    
    private static boolean[][] map;
    private static boolean[][] visit;
    
    private static int M, N, K;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int testCase = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        for(int i=0; i<testCase; i++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken()); // 가로 x 2
            N = Integer.parseInt(st.nextToken()); // 세로 y 1
            K = Integer.parseInt(st.nextToken());
            
            map = new boolean[N][M];
            visit = new boolean[N][M];
            
            for(int j=0; j<K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                
                map[y][x] = true;
            }
            
            int count = 0;
            for(int x=0; x<M; x++) {
                for(int y=0; y<N; y++) {
                    if (map[y][x] && !visit[y][x]) {
                        count++;
                        dfs(x, y);
                    }
                }
            }
            System.out.println(count);
        }
    }
    
    private static void dfs(int x, int y) {
        visit[y][x] = true;
        int[] dirX = {0, 0, -1, 1};
        int[] dirY = {1, -1, 0, 0};
        
        for (int i=0; i<4; i++) {
            int nowX = x + dirX[i];
            int nowY = y + dirY[i];
            
            if (nowX >= 0 && nowX < M && nowY >= 0 && nowY < N) {
                if (!visit[nowY][nowX] && map[nowY][nowX]) {
                    dfs(nowX, nowY);
                }
            }
        }
        
    }
}