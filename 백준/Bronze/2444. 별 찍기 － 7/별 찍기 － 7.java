import java.util.Scanner;

class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        for (int i=0; i<input; i++) {
            StringBuilder sb = new StringBuilder();
            
            int space = input-i-1;
            for (int j=0; j<space; j++) {
                sb.append(" ");
            }
            
            int star = 2*i + 1;
            for (int k=0; k<star; k++) {
                sb.append("*");
            }
            System.out.println(sb.toString());
        }
        
        for (int i=input-1; i>0; i--) {
            StringBuilder sb2 = new StringBuilder();
            
            int space = input-i;
            for (int j=0; j<space; j++) {
                sb2.append(" ");
            }
            
            int star = 2*(i-1)+1;
            for (int k=0; k<star; k++) {
                sb2.append("*");
            }
            System.out.println(sb2.toString());
        }
    }
}