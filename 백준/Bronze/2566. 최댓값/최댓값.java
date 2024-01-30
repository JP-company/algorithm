import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int max = 0;
        int row = 1;
        int column = 1;
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++) {
                int current = sc.nextInt();
                if (current > max) {
                    max = current;
                    row = i+1;
                    column = j+1;
                }
            }
        }
        
        System.out.println(max);
        System.out.print(row + " " + column);
    }
}