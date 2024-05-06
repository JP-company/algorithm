import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
    static boolean[][] map;
    static boolean[] visitDFS;
    static boolean[] visitBFS;

    static int N, M, V;

    static StringBuilder sb;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        map = new boolean[N+1][N+1];
        visitDFS = new boolean[N+1];
        visitBFS = new boolean[N+1];

        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = true;
            map[b][a] = true;
        }

        sb = new StringBuilder();
        dfs(V);
        System.out.println(sb);

        sb = new StringBuilder();
        bfs(V);
        System.out.println(sb);
    }

    private static void dfs(int start) {
        visitDFS[start] = true;
        sb.append(start).append(' ');

        for(int i=1; i<=N; i++) {
            if(map[start][i] && !visitDFS[i]) {
                dfs(i);
            }
        }
    }

    private static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visitBFS[start] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            sb.append(node).append(' ');

            for(int i=1; i<=N; i++) {
                if (map[node][i] && !visitBFS[i]) {
                    visitBFS[i] = true;
                    q.offer(i);
                }
            }
        }
    }

}