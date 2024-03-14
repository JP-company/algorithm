import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numbers = new int[N];
        
        for (int i=0; i<N; i++) {
            numbers[i] = sc.nextInt();
        }
        
        for (int i=0; i<N-1; i++) {
            for (int j=i; j<N-1; j++) {
                if (numbers[i] > numbers[j+1]) {
                    exchange(numbers, i, j+1);
                }
            }
            System.out.println(numbers[i]);
        }
        System.out.println(numbers[N-1]);
    }
    
    public static void exchange(int[] numbers, int index1, int index2) {
        int temp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = temp;
    }
}