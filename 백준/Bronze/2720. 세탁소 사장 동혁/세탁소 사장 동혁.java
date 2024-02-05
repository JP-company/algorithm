import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        
        int[] coin = {25, 10, 5, 1};
        for (int i=0; i<count; i++) {
            int money = sc.nextInt();
            
            for (int j=0; j<coin.length; j++) {
                int unit = coin[j];
                System.out.print(money/unit);
                money %= unit;
                if (j == 3) {
                    System.out.println();
                    continue;
                }
                System.out.print(" ");
            }
        }
    }
}