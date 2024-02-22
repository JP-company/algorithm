import java.util.*;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        while (input != -1) {
            List<Integer> divisors = new ArrayList<>();
            int max = (int) Math.sqrt(input);
            
            for (int i=2; i<=max; i++) {
                if (input % i == 0) {
                    divisors.add(i);
                    divisors.add(input/i);
                }
            }
            int sum = divisors.stream().mapToInt(i -> i).sum() + 1;
            if (input == sum) {
                divisors.sort(Integer::compareTo);
                System.out.printf("%d = 1", input);
                for (Integer divisor : divisors) {
                    System.out.printf(" + %d", divisor);
                }
            } else {
                System.out.printf("%d is NOT perfect.", input);
            }
            System.out.println();
            input = sc.nextInt();
        }
    }
}