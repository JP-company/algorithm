import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int i = 1;
        while (N > 3*i*(i-1) + 1) {
            i++;
        }
        System.out.println(i);
    }
}