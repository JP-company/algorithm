import java.util.*;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sequence = sc.nextInt();
        
        List<Integer> divisors = new ArrayList<>();
        
        for (int i=1; i<=number; i++) {
            if (number % i == 0) {
                divisors.add(i);
            }
        }
        
        if (divisors.size() < sequence) {
            System.out.println(0);
            return;
        }
        System.out.println(divisors.get(sequence-1));
    }
}