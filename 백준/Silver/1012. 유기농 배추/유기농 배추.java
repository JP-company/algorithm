import java.io.*;
import java.util.*;

public class Main {
    
    static int dirX[] = {0, 0, -1, 1};
    static int dirY[] = {-1, 1, 0, 0};
    static boolean[][] map;
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
            
            map = new boolean[N][M];
            visit = new boolean[N][M];
            
            for (int j=0; j<K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                
                map[y][x] = true; // 배추 위치 저장
            }
            
            count = 0;
            for(int j=0; j<N; j++) {  // 하나씩 돌아다니면서 방문안하고, 배추가 있는 곳 찾기
                for(int k=0; k<M; k++) {
                    if (map[j][k] && !visit[j][k]) {
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
        
        for(int i=0; i<4; i++) {  // 4방향 표현
            int now_x = x + dirX[i]; 
            int now_y = y + dirY[i];
            
            // 밭 범위 안에 있고, 방문 안했고, 배추가 있으면 dfs
            if (rangeCheck(now_x, now_y) && !visit[now_y][now_x] && map[now_y][now_x]) {
                dfs(now_x, now_y);
            }
        }
    }
    
    public static boolean rangeCheck(int x, int y) {
        return y < N && y >= 0 && x < M && x >= 0;
    }
}