import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();
        
        int total = angle1 + angle2 + angle3;
        
        if (total != 180) {
            System.out.println("Error");
            return;
        }
        
        if (angle1 == angle2 && angle2 == angle3) {
            System.out.println("Equilateral");
            return;
        }
        
        if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
            
            System.out.println("Isosceles");
            return;
        }
        System.out.println("Scalene");
    }
}