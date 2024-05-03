import java.io.*;
import java.util.*;

public class Main {
    
    static int dirX[] = {0, 0, -1, 1};
    static int dirY[] = {-1, 1, 0, 0};
    static int[][] map;
    static boolean[][] visit;
    
    static int M, N, K;
    static int count;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int testCase = Integer.parseInt(br.readLine());
        for (int i=0; i<testCase; i++) {
            st = new StringTokenizer(br.readLine());
            
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            
            map = new int[N][M];
            visit = new boolean[N][M];
            
            for (int j=0; j<K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                
                map[y][x] = 1;
            }
            
            count = 0;
            for(int j=0; j<N; j++) {
                for(int k=0; k<M; k++) {
                    if (map[j][k] == 1 && visit[j][k] == false) {
                        count++;
                        dfs(k, j);
                    }
                }
            }
            sb.append(count).append('\n');            
        }
        
        System.out.println(sb);
    }
    
    public static void dfs(int x, int y) {
        visit[y][x] = true;
        
        for(int i=0; i<4; i++) {
            int now_x = x + dirX[i];
            int now_y = y + dirY[i];
            
            if (rangeCheck(now_x, now_y) && visit[now_y][now_x] == false && map[now_y][now_x] == 1) {
                dfs(now_x, now_y);
            }
        }
    }
    
    public static boolean rangeCheck(int x, int y) {
        return y < N && y >= 0 && x < M && x >= 0;
    }
}