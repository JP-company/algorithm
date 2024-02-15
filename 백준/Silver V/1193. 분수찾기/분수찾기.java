import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int group = 0;

        while (input > group) {
            input -= group;
            group++;
        }

        int a = input;
        int b = group - input + 1;

        if (group % 2 == 1) {
            a = group - input + 1;
            b = input;
        }

        System.out.println(a + "/" + b);
    }
}