import java.util.Scanner;

class Main {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int inputLength = input.length();
        StringBuilder sb = new StringBuilder();
        
        for(int i=inputLength-1;i>=0;i--) {
            sb.append(String.valueOf(input.charAt(i)));
        }

        if (input.equals(sb.toString())) {
            System.out.println(1);
            return;
        }
        System.out.println(0);
    }
}