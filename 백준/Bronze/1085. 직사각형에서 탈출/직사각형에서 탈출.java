import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int w = sc.nextInt();
        int h = sc.nextInt();
        
        int widthMin = x < w-x ? x : w-x;
        int heightMin = y < h-y ? y : h-y;
        
        int min = widthMin < heightMin ? widthMin : heightMin;
        System.out.println(min);
    }
}