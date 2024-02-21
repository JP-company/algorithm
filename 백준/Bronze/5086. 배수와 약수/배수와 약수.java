import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int input1;
        int input2;
        
        do {
            input1 = sc.nextInt();
            input2 = sc.nextInt();
            
            if (input1 > input2) {
                if (input2 != 0 && input1 % input2 == 0) {
                    System.out.println("multiple");
                    continue;
                }
            }
            
            if (input1 != 0 && input2 % input1 == 0) {
                System.out.println("factor");
                continue;
            }
            
            if (input1 != input2) {
                System.out.println("neither");
            }
            
        } while(input1 != input2);
    }
}