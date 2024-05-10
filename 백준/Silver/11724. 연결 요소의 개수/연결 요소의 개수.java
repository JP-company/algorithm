import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.StringTokenizer;

public class Main {
    
    private static boolean[][] map;
    private static boolean[] visit;
    private static int size;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        size = N+1;
        
        map = new boolean[size][size];
        visit = new boolean[size];
        
        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            map[u][v] = map[v][u] = true;
        }
        
        int count = 0;
        for (int i=1; i<size; i++) {
            if (!visit[i]) {
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }
    
    private static void dfs(int n) {
        visit[n] = true;
        
        for (int i=1; i<size; i++) {
            if (map[n][i] && !visit[i]) {
                dfs(i);
            }
        }
    }
}
