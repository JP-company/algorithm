import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

public class Main {
    
    static boolean[] check;
    static boolean[][] arr;
    static int count = 0;
    
    static int node, line;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        node = Integer.parseInt(br.readLine());
        line = Integer.parseInt(br.readLine());
        
        arr = new boolean[node+1][node+1];
        check = new boolean[node+1];
        
        // 그래프 행렬 채우기
        for (int i=0; i<line; i++) {
            String[] strArr = br.readLine().split(" ");
            int first = Integer.parseInt(strArr[0]);
            int second = Integer.parseInt(strArr[1]);
            
            arr[first][second] = arr[second][first] = true;
        }
        
        dfs(1);
        
        System.out.println(count-1);
        
    }
    
    public static void dfs(int start) {
        check[start] = true;
        count++;
        
        for(int i=1; i<=node; i++) {
            if (arr[start][i] && !check[i]) {
                dfs(i);
            }
        }
    }
}