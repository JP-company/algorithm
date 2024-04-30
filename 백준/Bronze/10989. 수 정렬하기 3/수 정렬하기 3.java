import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        final int size = 10_000;
        int[] arr = new int[size + 1];
        
        int N = Integer.parseInt(br.readLine());
        
        for (int i=0; i<N; i++) {
            int value = Integer.parseInt(br.readLine());
            arr[value]++;
        }
        
        br.close();
        
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i]; j++) {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }
}