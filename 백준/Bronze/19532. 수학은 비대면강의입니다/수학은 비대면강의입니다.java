import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        
        if (a == 0) {
            int yValue = c/b;
            int xValue = (f - e*yValue)/d;
            System.out.printf("%d %d", xValue, yValue);
            return;
        }
        
        if (d == 0) {
            int yValue = f/e;
            int xValue = (c - b*yValue)/a;
            System.out.printf("%d %d", xValue, yValue);
            return;
        }
        
        int lcm = (a*d)/gcd(a, d);
        
        int yCoefficient1 = lcm/a * b;
        int yCoefficient2 = lcm/d * e;
        
        int const1 = lcm/a * c;
        int const2 = lcm/d * f;
        
        int yValue = (const1 - const2) / (yCoefficient1 - yCoefficient2);
        int xValue = (c - yValue*b) / a;
        
        System.out.printf("%d %d", xValue, yValue);
    }
    
    public static int gcd(int a, int b) {
        while (a % b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return b;
    }
}