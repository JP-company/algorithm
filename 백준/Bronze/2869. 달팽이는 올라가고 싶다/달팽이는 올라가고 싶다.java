import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int up = sc.nextInt();
        int down = sc.nextInt();
        int total = sc.nextInt();
        
        int answer;
        if ((total - up)%(up - down) == 0) {
            answer = (total - up)/(up - down) + 1;
        } else{
            answer = (total - up)/(up - down) + 2;
        }
        
        System.out.println(answer);
    }
}