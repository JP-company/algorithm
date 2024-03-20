import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int total = sc.nextInt();
        int price = sc.nextInt();
        
        int[] arr = new int[total];
        
        for (int i=0; i<total; i++) {
            int input = sc.nextInt();
            
            if (i == 0) {
                arr[i] = input;
                continue;
            }
            
            inner:
            for (int j=i; j>0; j--) {
                if (input > arr[j-1]) {
                    arr[j] = arr[j-1];
                    arr[j-1] = input;
                } else {
                    arr[j] = input;
                    break inner;
                }
            }
        }
        System.out.println(arr[price-1]);
    }
}