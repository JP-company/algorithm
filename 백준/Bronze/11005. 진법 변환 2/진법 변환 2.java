import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = sc.nextInt();

        List<Character> list = new ArrayList<>();
        while (num > 0) {
            int i = num % n;
            char ch;
            if (i < 10) {
                ch = (char) (i + 48);
            } else {
                ch = (char) (i + 55);
            }
            list.add(ch);
            num /= n;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=list.size()-1; i>=0; i--) {
            sb.append(list.get(i));
        }

        System.out.println(sb);
    }
}