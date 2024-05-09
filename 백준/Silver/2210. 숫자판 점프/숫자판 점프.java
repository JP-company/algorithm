import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;
import java.util.Set;
import java.util.HashSet;

public class Main {
    
    private static final int size = 5;
    private static final int maxDepth = 6;
    private static final int[] dirA = {0, 0, -1, 1};
    private static final int[] dirB = {-1, 1, 0, 0};

    private static Set<String> set;
    private static int[][] map;
    private static int[] arr;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        map = new int[size][size];
        arr = new int[maxDepth];
        set = new HashSet<>();

        for (int i=0; i<size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j=0; j<size; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i=0; i<size; i++) {
            for (int j=0; j<size; j++) {
                dfs(i, j, 1);
            }
        }
        System.out.println(set.size());
    }

    private static void dfs(int a, int b, int depth) {
        if (depth > maxDepth) {
            StringBuilder sb = new StringBuilder();
            for (int i=0; i<maxDepth; i++) {
                sb.append(arr[i]);
            }
            set.add(sb.toString());
            return;
        }

        arr[depth-1] = map[a][b];

        for (int i=0; i<4; i++) {
            int nowA = a + dirA[i];
            int nowB = b + dirB[i];

            if(nowA>=0 && nowA<size && nowB>=0 && nowB<size) {
                dfs(nowA, nowB, depth+1);
            }
        }
    }
}