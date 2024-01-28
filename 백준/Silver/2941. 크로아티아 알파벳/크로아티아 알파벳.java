import java.util.Scanner;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> caList = List.of("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=");
        String input = sc.next();
        
        for (String ca : caList) {
             input = input.replace(ca, " ");
        }
        System.out.println(input.length());
    }
}