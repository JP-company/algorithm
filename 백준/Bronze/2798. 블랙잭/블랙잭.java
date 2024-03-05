import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        List<Integer> cards = new ArrayList<>();
        for (int i=0; i<n; i++) {
            cards.add(sc.nextInt());
        }
        
        int max = 0;
        for (int i=0; i<n-2; i++) {
            for (int j=i+1; j<n-1; j++) {
                for (int k=j+1; k<n; k++) {
                    int sum = cards.get(i) + cards.get(j) + cards.get(k);
                    if (sum > max && sum <= m) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}