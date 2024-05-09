import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {
    
    private static final int[] dirA = {0, 0, 1, -1, 1, 1, -1, -1};
    private static final int[] dirB = {-1, 1, 0, 0, -1, 1, 1, -1};

    private static int w;
    private static int h;
    private static int[][] map;
    private static boolean[][] visit;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if (w == 0 && h == 0) break;

            map = new int[h][w];
            visit = new boolean[h][w];

            for (int i=0; i<h; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int count = 0;
            for(int i=0; i<h; i++) {
                for(int j=0; j<w; j++) {
                    if (map[i][j] == 1 && !visit[i][j]) {
                        count++;
                        dfs(i, j);
                    }
                }
            }
            System.out.println(count);
        }
    }

    private static void dfs(int a, int b) {
        visit[a][b] = true;

        for (int i=0; i<8; i++) {
            int nowA = a + dirA[i];
            int nowB = b + dirB[i];

            if (nowA>=0 && nowA<h && nowB>=0 && nowB<w && !visit[nowA][nowB] && map[nowA][nowB] == 1) {
                dfs(nowA, nowB);
            }
        }
    }
}