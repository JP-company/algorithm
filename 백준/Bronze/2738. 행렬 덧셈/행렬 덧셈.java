import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] matrix1 = new int[row][column];
        int[][] matrix2 = new int[row][column];

        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                int sum = matrix1[i][j] + sc.nextInt();
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}