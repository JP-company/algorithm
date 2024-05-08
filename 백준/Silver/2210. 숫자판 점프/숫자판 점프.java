import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    private static int[] dirX = {0, 0, -1, 1};
    private static int[] dirY = {-1, 1, 0, 0};

    private static int[] arr;
    private static int[][] map;

    private static Set<String> set;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = 5;
        map = new int[size][size];
        for (int i=0; i<size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<size; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        set = new HashSet<>();
        arr = new int[6];

        for (int i=0; i<size; i++) {
            for (int j=0; j<size; j++) {
                dfs(i, j, 1);
            }
        }

        System.out.println(set.size());
    }

    private static void dfs(int x, int y, int count) {
        if (count > 6) {
            StringBuilder sb = new StringBuilder();

            for(int i=0; i<arr.length; i++) {
                sb.append(arr[i]);
            }
            set.add(sb.toString());
            return;
        }

        arr[count-1] = map[x][y];

        for (int i=0; i<4; i++) {
            int nowX = x + dirX[i];
            int nowY = y + dirY[i];

            if (nowX>=0 && nowX<5 && nowY>=0 && nowY<5) {
                dfs(nowX, nowY, count+1);
            }
        }
    }
}
