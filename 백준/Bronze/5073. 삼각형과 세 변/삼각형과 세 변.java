import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            List<Integer> sides = new ArrayList<>();
            for (int i=0; i<3; i++) {
                int side = sc.nextInt();
                if (side == 0) return;
                sides.add(side);
            }
            Collections.sort(sides);
            
            int longestSide = sides.get(2);
            int side1 = sides.get(1);
            int side2 = sides.get(0);
            
            if (longestSide >= side1 + side2) {
                System.out.println("Invalid");
                continue;
            }
            
            if (longestSide == side1 && side1 == side2) {
                System.out.println("Equilateral");
                continue;
            }
            
            if (longestSide == side1 || side1 == side2) {
                System.out.println("Isosceles");
                continue;
            }
            System.out.println("Scalene");
        }
    }
}