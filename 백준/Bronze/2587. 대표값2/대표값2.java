import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 5;
        int[] arr = new int[N];
        
        int total = 0;
        for (int i=0; i<N; i++) {
            int input = sc.nextInt();
            total += input;
            
            if (i == 0) {
                arr[i] = input;
                continue;
            }
            
            inner:
            for (int j=i-1; j>=0; j--) {
                if (arr[j] > input) {
                    arr[j+1] = arr[j];
                    arr[j] = input;
                } else {
                    arr[j+1] = input;
                    break inner;
                }                
            }
        }
        
        System.out.println(total/5);
        System.out.println(arr[2]);
    }
}