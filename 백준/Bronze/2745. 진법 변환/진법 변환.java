import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        int answer = 0;
        int m = 0;
        for(int i=str.length()-1; i>=0; i--) {
            char ch = str.charAt(i);
            if(ch < 65) {
                answer += (str.charAt(i) - 48) * Math.pow(n, m);
            } else {
                answer += (str.charAt(i) - 55) * Math.pow(n, m);
            }
            m++;
        }
        System.out.println(answer);
    }
}