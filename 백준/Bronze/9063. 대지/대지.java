import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        if (count < 2) {
            System.out.println(0);
            return;
        }
        
        List<Integer> posXs = new ArrayList<>();
        List<Integer> posYs = new ArrayList<>();
        
        for (int i=0; i<count; i++) {
            posXs.add(sc.nextInt());
            posYs.add(sc.nextInt());
        }
        
        int minX = posXs.stream().mapToInt(i -> i).min().getAsInt();
        int maxX = posXs.stream().mapToInt(i -> i).max().getAsInt();
        
        int minY = posYs.stream().mapToInt(i -> i).min().getAsInt();
        int maxY = posYs.stream().mapToInt(i -> i).max().getAsInt();
        
        int width = (maxX - minX) * (maxY - minY);
        
        System.out.println(width);
    }
}