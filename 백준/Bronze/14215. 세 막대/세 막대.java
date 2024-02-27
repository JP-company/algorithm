import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> sides = new ArrayList<>();
        for (int i=0; i<3; i++) {
            sides.add(sc.nextInt());
        }
        Collections.sort(sides);
        
        int longestSide = sides.get(2);
        int side1 = sides.get(1);
        int side2 = sides.get(0);
        
        if (longestSide >= side1 + side2) {
            int sum = side1 + side2;
            System.out.println(2*sum - 1);
            return;
        }
        System.out.println(longestSide + side1 + side2);
    }
}